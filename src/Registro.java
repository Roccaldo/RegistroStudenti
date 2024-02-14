import java.util.*;

public class Registro {
    HashMap<String, Studente> registroStudenti;

    public Registro() {
        this.registroStudenti = new HashMap<>();
    }

    public HashMap<String, Studente> getRegistroStudenti() {
        return registroStudenti;
    }

    public void setRegistroStudenti(HashMap<String, Studente> registroStudenti) {
        this.registroStudenti = registroStudenti;
    }

    public void aggiungiStudenteAlRegistro(String matricola, Studente studente) {
        if (registroStudenti.containsKey(matricola)) {
            throw new RuntimeException("studente gia inserito");
        } else {
            registroStudenti.put(matricola, studente);
        }
    }

    public void rimuoviStudenteDaRegistro(String matricola, Studente studente) {
        if (registroStudenti.containsKey(matricola)) {
            registroStudenti.remove(matricola, studente);
        } else {
            throw new RuntimeException("studente insesistente");
        }
    }

    public void mostraStudentiNelRegistro() {
        for (Map.Entry<String, Studente> mapVar : registroStudenti.entrySet()) {
            mapVar.getValue().stampaDettagli();
        }
    }

    public void cercaStudentiPerMatricola(String matricola) throws Exception {
        Studente studente = registroStudenti.get(matricola);
        System.out.println("Studente trovato: ");
        studente.stampaDettagli();
    }

    public int calcoloTotaleStudenti() {
        int somma = 0;
        somma += registroStudenti.size();
        return somma;
    }

    public int calcoloEtaMedia() {
        int var = 0;
        int etaMedia = 0;
        for (Studente studenteVar : registroStudenti.values()) {
            var += studenteVar.calcolaEtaStudente();
            etaMedia = var / registroStudenti.size();
        }
        return etaMedia;
    }

    public void ordinaPerAnno() {
        ArrayList<Studente> studenteList = new ArrayList<>(registroStudenti.values());
        studenteList.sort(Comparator.comparing(Studente::getAnnoDiNascita));
        for (Studente studente : studenteList) {
            studente.stampaDettagli();
        }
    }
}

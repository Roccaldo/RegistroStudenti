import java.time.LocalDate;

public class Studente {
    private String matricola;
    private String nome;
    private String cognome;
    private Integer annoDiNascita;

    public Studente(String matricola, String nome, String cognome, Integer annoDiNascita) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.annoDiNascita = annoDiNascita;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getAnnoDiNascita() {
        return annoDiNascita;
    }

    public void setAnnoDiNascita(Integer annoDiNascita) {
        this.annoDiNascita = annoDiNascita;
    }

    public Integer calcolaEtaStudente() {
        LocalDate annoCorrente = LocalDate.now();
        Integer annoDiNascita = annoCorrente.getYear() - getAnnoDiNascita();
        return annoDiNascita;
    }

    public void stampaDettagli() {
        System.out.println("Matricola: " + matricola + " " + " Studente: " + nome + " " +
                cognome + " " + annoDiNascita + " " + " Età: " +
                calcolaEtaStudente());
    }
}

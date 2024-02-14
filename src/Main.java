public class Main {
    public static void main(String[] args) throws Exception {
        Studente studente1 = new Studente("1", "Mario", "Rossi", 1999);
        Studente studente2 = new Studente("2", "Angela", "Viola", 2001);
        Studente studente3 = new Studente("3", "Marco", "Bianchi", 1998);
        Studente studente4 = new Studente("4", "Luca", "Verdi", 1989);

        Registro registro = new Registro();
        registro.aggiungiStudenteAlRegistro(studente4.getMatricola(), studente4);
        registro.aggiungiStudenteAlRegistro(studente2.getMatricola(), studente2);
        registro.aggiungiStudenteAlRegistro(studente1.getMatricola(), studente1);
        registro.aggiungiStudenteAlRegistro(studente3.getMatricola(), studente3);
        registro.rimuoviStudenteDaRegistro(studente1.getMatricola(), studente1);
        registro.mostraStudentiNelRegistro();
        registro.cercaStudentiPerMatricola(studente2.getMatricola());
        System.out.println("Totale studenti: " + registro.calcoloTotaleStudenti());
        System.out.println("Età media: " + registro.calcoloEtaMedia());
        registro.ordinaPerAnno();
    }
}
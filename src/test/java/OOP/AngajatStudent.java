package OOP;

public class AngajatStudent extends Persoana implements AngajatInt ,StudentInt{
    public AngajatStudent(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Angajatul merge la munca");
    }

    @Override
    public void primesteSalariul() {
        System.out.println("Angajatul primeste salariul");
    }

    @Override
    public void mergeInPauza() {
        System.out.println("Angajatul merge in pauza");
    }

    @Override
    public void prezintaDemisie() {
        System.out.println("Angajatul nu pleaca");
    }

    @Override
    public void mergeLaCurs() {
        System.out.println("Studentul merge la curs");
    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul are sesiune");
    }

    @Override
    public void mergeLaCafea() {
        System.out.println("Studentul este silitaor, nu ca Alex");
    }
}

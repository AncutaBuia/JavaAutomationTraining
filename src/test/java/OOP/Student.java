package OOP;

public class Student extends Persoana{   //apelam mostenirea: extends Persona

    //definim informatiile care sa fie specifice studentluiui:
    public String facultate;
    public String an;
    public Boolean bursa;

    //constructorul o sa fie mostenit + adaugam noile valori pe care vrem sa le aibe clasa student
    public Student(String nume, String prenume, Integer varsta, String facultate, String an,Boolean bursa) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.an = an;
        this.bursa = bursa;
    }

    public void infoStudent()
    {
       infoPersona(); //mosteneste
        System.out.println("Facultatea este: " + facultate);
        System.out.println("Anul universitar: " + an);
        System.out.println("Primeste Bursa?: " + bursa);
    }

}

package OOP;

public class Persoana {

    //OOP = programare orientate pe obiect
    //Principii: mostenire, incapsulare, polimorfism, abstractizare
    //mostenire = conceptul prin care o clasa(copil) mosteneste o alta clasa(parinte)
    //in Java putem mosteni o singura clasa
    //in momentul cand o clasa mosteneste o alta clasa , clasa copil trebuie sa apeleze contructorul din parinte
    //in momentul in care se aplica mostenirea , copilul are vizibilitate asupra variabilelor/metodelor din parinte
    //constructorul din parinte in copil si apeleaza cu super

    public String nume;
    public String prenume;
    public Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersona()
    {
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenuumele persoanei este: " + prenume);
        System.out.println("Varsta persoanei este: " + varsta);
    }
}

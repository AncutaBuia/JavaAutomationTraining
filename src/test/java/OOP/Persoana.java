package OOP;

public class Persoana {

    //OOP = programare orientate pe obiect
    //Principii: mostenire, incapsulare, polimorfism, abstractizare
    //mostenire = conceptul prin care o clasa(copil) mosteneste o alta clasa(parinte)
    //in Java putem mosteni o singura clasa
    //in momentul cand o clasa mosteneste o alta clasa , clasa copil trebuie sa apeleze contructorul din parinte
    //in momentul in care se aplica mostenirea , copilul are vizibilitate asupra variabilelor/metodelor din parinte
    //constructorul din parinte in copil si apeleaza cu super

    //INCAPSULARE= procesul prin care tinem departe anumite informatii ca ele sa nu poate fi modificate
    //facem variabilele/metode din public in private
    //private = access control care restrictioneaza accesul doar in clasa respective
    //ca sa extragem/modificam o valoare a unei variabile private ne folosim de metode get/set

    //Polimorfiscmul = procesul prin care definim mai multe implementari pentru o metoda
    //Polimorfismul poate fi de 2 feluri: dinamic(override) si static(overload)
    //Polimorfismul dinamic = intr-o iereahie de clase obtinute prin mostenire o metoda poate avea implemantari diferite
    //Polimorfismul static = posibilitatea prin care o metoda are mai mult implementari prin diferentierea numarului sau tipului de parametrii;

    //Abstractizarea = reducerea unui element complex la un element mai simplu (reducerea completa a implementarii a metodelor
    //(reducerea completa a implementarii a metodelor lasand doar numele functiilor, parametrii, tipul returnat)
    //Abstractizarea se poate obtine prin clase abstracte si sau interfete
    //Clasele abstracte sunt utilizate pentru a declara caracteristici comune unor subclase  (ex.clasa formegeometrice si o caracteristica comuna calcularearie)
    //O clasa abstacta nu poate fi instantiata
    //Ea poate fi utilizata numai ca si superClasa pt alte clase care extind clasa abstracta (clasa abstracta este declarata folosid cuvantul cheie/modificatorul 'abstract'
    //O clasa abstracta poate contine atribute si metode pe langa clasa abstracta

    //Interfata = ofera raspuns lipsei mostenirii multiple (nu poti sa extinzi o clasa de mai multe ori 'extends')
    //Interfata creeaza un protocol pe care clasele trebuie sa le implementeze (nu iti permite sa declari fielduri ci doar metode)
    //Interfata contine toate metodele abstracte ( e o clasa pur abstracta)


    private String nume;
    private String prenume;
    private Integer varsta;

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

    //definim prima implementare pentru o metoda (polimorfism dinamic)
    public void mananca()
    {
        System.out.println("Persoana mancanca cand ii este foame");
    }


    //geter: pe care vreau sa ii accessez
    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    //setter: ce modific


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}

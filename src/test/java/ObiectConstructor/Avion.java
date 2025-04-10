package ObiectConstructor;

import java.sql.SQLOutput;

public class Avion {

    //Constructor = Are ca rol sa initializeze variabilele unei Clase
    //Recunoastem un constructor dupa numele clasei
    //Intr-o clasa putem avea n constructori care se diferentiaza dupa numarul sau tipul de parametri
    //Exista 2 tipuri de contructori: cu parametri sau fara parametri
    //Intr-o clasa avem tot timpul un constructor defauld (fara parametri)
    //Constructorul trebuie sa fie public
    //Obiect = instanta unei clase
    //Dintr-o clasa putem sa facem mai multe obiecte
    //Ca sa initializam un obiect ne folosim de cuvantul "new"
    //Cand se initializeaza un obiect se apeleaza contructorul Clasei

//proprietatile avionului:
    public String tip;
    public String marca;
    public String model;
    public Integer capacitatePasageri;
    public String tipCombustibil;
    public Integer numarBgaje; //Vrem sa adaugam o proprietate clasei- dar sa nu o adaugam tuturor Obiectele: atunci mai facem un constructor care sa contina si aceasta proprietate

 //Generam constructor
    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;

    }

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil, Integer numarBgaje) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
        this.numarBgaje = numarBgaje;
    }

    public void prezentareAvion(){
        System.out.println("Tipul avionului: " + tip);
        System.out.println("Marca avionului: " + marca);
        System.out.println("Modelul avionului: " + model);
        System.out.println("Capacitatea Pasagerilor: " + capacitatePasageri);
        System.out.println("Tipul combustibilului: " + tipCombustibil);
            if (numarBgaje != null){
                System.out.println("Numarul bagajelor: " + numarBgaje);
        }
            else {
                System.out.println("Avion nu contine bagaje");
            }
    }





}




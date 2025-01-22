package VariabilaMetoda;

import org.testng.annotations.Test;

public class Masina {

    public String marca;

    public String model;

    public Integer anFabricatie;

    @Test
    public void metodaTest(){
        dateMasina("Audi", "Q7",2023); //set de date
        dateMasina("Bmw", "x1",2023); //folosim metoda pt mai multe seturi de data

        calculMedie(7.5,8.0); // metoda de jos calculMedie e apelata in metodaTest
        calculMedie(6.5,9.0);
    }


    //parametrizam metoda:
    public void dateMasina(String param1, String param2, Integer param3){
        marca = param1;
        model = param2;
        anFabricatie = param3;

        System.out.println("Marca masinii este: " + marca);//cauta: sout
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul de fabricatie al masinii este: " + anFabricatie);

    }

    //calculam media a doua numere:
    public void calculMedie(Double Nota1, Double Nota2){
        Double rezultat = (Nota1 + Nota2) / 2;
        System.out.println("Media este: " + rezultat);
    }

}

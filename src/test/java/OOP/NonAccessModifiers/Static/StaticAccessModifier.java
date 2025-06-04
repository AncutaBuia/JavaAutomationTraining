package OOP.NonAccessModifiers.Static;

//Static:
//La nivel de static: un modificator static poate fi aplicat la nivel de variabila,
//metoda,bloc de initializare, la inner class sau la inner interface
//Nu poti sa folosesti la clasa exterioara sau clasa parinte
//O proprietate Statica: poate fi apelat prin numele clasei: ex. NumeClasa.proprietate sau NumeClasa.NumeMetoda
//Eficienta la nivelul salvarei memoriei

public class StaticAccessModifier {

    static String name  = "Endava";

    public static void printMessage(){
        System.out.println("Printeaza metoda");
    }
}

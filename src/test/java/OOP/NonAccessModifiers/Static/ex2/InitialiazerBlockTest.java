package OOP.NonAccessModifiers.Static.ex2;

//1.clasa
public class InitialiazerBlockTest {

    //2.declarari de variabile
    private String name = "Ana";

    //3.Structuri de initializare
    static {
        System.out.println("setting field");
        //  name = "test"; //daca vrei sa reinitializezi variabila de sus
    }

    //4.Constructorul
    public  InitialiazerBlockTest(){
        name = "Serena";
        System.out.println("setting constructor");
    }

    //5.Restul metodelor
    public static void main(String[] args) {
        InitialiazerBlockTest test = new InitialiazerBlockTest();
        System.out.println(test.name);
    }
}

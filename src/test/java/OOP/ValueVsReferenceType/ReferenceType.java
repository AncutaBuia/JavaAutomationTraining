package OOP.ValueVsReferenceType;

public class ReferenceType {

    public static void main(String[] args) {
        String st1 = new String("hello"); //cazul asta pt referentiaza la un obiect nu o sa fie la fel valorile
        String st2 = new String("hello");

        int intreg1=5; //cazul asta pt referentiaza la o data primitiva  o sa fie la fel valorile
        int intreg2=5;



        if(st1 == st2){
            System.out.println("valorile sunt la fel");
        }else{
            System.out.println("valorile nu sunt la fel");
        }

        if(intreg1 == intreg2){
            System.out.println("valorile sunt la fel");
        }else{
            System.out.println("valorile nu sunt la fel");
        }

    }



}

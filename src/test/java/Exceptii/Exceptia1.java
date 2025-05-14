package Exceptii;

public class Exceptia1 {

    //exceptiile reprezinta situatii care apar in timpul executiei unui program care determina oprirea acestuia;
    //ofera un mecanism eficient de identificare si rezolvare a erorilor;
    //sunt modelate sub forma de clase: clasa error, clasa exception, tuntime exeption, clase personalizate;
    //exceptiile sunt gestionate folosind cuvinte predefinite in java: try - cath si finally;
    //sunt 2 tipuri mari de exceptii: checked si unchecked;
    //erorile checked: sunt exceptii de compilare ( nu se poate buildui sau rula proiectul).
    //exemple: SQLExcemption, IOException, ClassNotFoundException;
    //erorile unchecked: sunt exceptii de runtime care sunt ignorate in timpul compilarii sar sunt aruncare in timpul executoeo programului;
    //exemple: NullPointerExeption, ArrayIndexOutOfBound, AritmeticException;
    //throw: este un cuvant cheie care arunca exceptia in mod explicit de la o metoda sau un bloc de cod;
    //throws: este un cuvant cheie care se foloseste odata cu metoda care poate arunca un tip sau mai multe de exceptii;


    public static void main(String[] args){

        try {
            System.out.println(12 / 0);
        } catch(ArithmeticException e){     //specificam tipul de eroare pe care vrem sa il tratam ArithmeticException si dam un nume la clasa: e
            System.out.println("Error Artithmetic exception thrown: " + e.getMessage()); //apelam variabila e si  metoda predefinita getMessage()
        }
    }

}

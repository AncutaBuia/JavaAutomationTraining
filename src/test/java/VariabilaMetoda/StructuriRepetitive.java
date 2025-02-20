package VariabilaMetoda;

import java.util.Scanner;

public class StructuriRepetitive {

    public static void main (String[] args) {

        citireNote();
        printareValoriWhile();
        printareValoriDoWhile();
        printareValoriFor();
    }

        //STRUCTURI REPETITIVE:
        //Afisam toate numerele de la 1-10: scenariu: verificam daca nr < 1 si >10
        public static void citireNote () {
            //while
            System.out.println("Introduceti nota");
            Scanner scanner = new Scanner(System.in);
            int nota = scanner.nextInt();
            while (nota < 1 || nota > 10) {
                System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10");
                nota = scanner.nextInt();
            }
            System.out.println("Nota " + nota + "este intre 1 si 10");
        }

        //Printam valorile de la 1 pana la 5:
        public static void printareValoriWhile (){
            int valoare  = 6;
            while ( valoare<=5 ){
                System.out.println("Valoarea este: + " + valoare);
                valoare ++;
                System.out.println("Valoare dupa parcurgerea while este " + valoare);
                //While-ul incepe de la valoarea 1 ->
                //cat timp valoarea <= 5 -> intra in prima iteratie(adica in prima bucata de code din cadrul while-ului)->
                // o printeaza: cu valoarea 1-> suntem inca in prima iteratie->
                // incrementeaza valoarea: valoarea devine 2->
                //el revine dupa ce face incrementul la linia unde incepe while-ul si face inca o verificare, si tot asa pana cand conditia nu mai este adevarata
            }
        }

        public static void printareValoriDoWhile(){
            int valoare = 6;
            do{
                System.out.println("Valoarea este : " + valoare);
                valoare ++;
            }while( valoare <=5 );
            System.out.println("Valoare dupa parcurgerea Do-while este " + valoare);
        }

        public static void printareValoriFor(){
            for (int valoare = 1; valoare <=5 ; valoare++ ){
                System.out.println("Valoare este: " + valoare);
            }
        }

}
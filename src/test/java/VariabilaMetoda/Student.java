package VariabilaMetoda;

import org.checkerframework.checker.units.qual.N;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    //Clasa = sablon care defineste proprietatile si comportamentul unei entitati specifice

    //Intr-un fisier Java putem avea mai multe clase diferentiate pe baza numelui (nu este un practice bun sa avem mai multe clase cu acelasi nume)

    //Intr-o clasa putem defini proprietatile si actiunile entitatii

    //variabila = proprietatea unei clase

    //variabilele pot fi de 2 feluri: globale si locale
    //variabilele globale= sunt vizibile in tot proiectul
    //variabilele locale= sunt vizibile doar in locul unde le-am declarat

    //ca sa definim o variabila globala: accesscontrol (public) tip variabila nume variabila

    //in momentul cand definim o variabila nu este obligatoriu sa ii dam o valoare

    //motoda = actiunea unei clase

    //exista 2 tipuri de metode: void si return


    public String Nume;

    public String Prenume;

    public Integer Varsta;

    public String Adresa;

    public Double Inaltime; //primeste valori cu zecimala

    public Float Greutate; //add f la final

    public Character Sex;

    public Boolean AreDiploma;


    @Test
    //Metoda:
    public void prezentareStudent(){
        Nume = "Cadis";
        Prenume = "Anca";
        Varsta = 29;
        Adresa = "Cluj";
        Inaltime = 1.6;
        Greutate = 50.2f;
        Sex ='F';
        AreDiploma = true;

        System.out.print(Nume+ " " + Prenume); //afiseaza informatia in aceeasi linie
        System.out.println(Nume+ " " + Prenume); //afiseaza informatia pe linii diferite
        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Are Studentul diploma? " + AreDiploma);


        calculMedie();
        System.out.println(getSalariu()); //afisam rezulatul returnat de metoda getSalariu

        citireNote();
    }

    public void calculMedie(){
        Integer notaMatematica = 8;
        Float notaEngleza = 9.5f;
        Double notaRomana = 5.6;

        Double medie = (notaRomana + notaEngleza + notaMatematica) / 3;

        System.out.println("Media studentului este: " + medie);
        }

        //Metoda return
        public Integer getSalariu(){
            Integer salariu = 5000;
            return salariu;
        }

        //STRUCTURI REPETITIVE:
        //Afisam toate numerele de la 1-10: scenariu: verificam daca nr < 1 si >10
        public void citireNote(){
            //while
            System.out.println("Introduceti nota");
            Scanner scanner = new Scanner(System.in);
            int nota = scanner.nextInt();
            while(nota < 1 || nota > 10 ){
                System.out.println("Nota " + nota + "trebuie sa fie intre 1 si 10");
                nota = scanner.nextInt();
            }
            System.out.println("Nota " + nota + "este intre 1 si 10" );
        }


}

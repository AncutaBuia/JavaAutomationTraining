package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

 //o multime = o colectie de obiecte, care au aceleasi conditii
 //multimi: array, list, map
 //intr-o multime este important pozitia


    @Test
    public void metodaTest(){
   // colegiCurs();
   // colegiCursLista();
        // categoriiObiecte();
   tariOrase();
    }

    //exemplu array:
        //array = o colectie de valori care au acelasi type: string , int etc.

     public void colegiCurs(){
        String[] colegi= new String[5];   //aici strebuie sa ii spunem dimensiunea elementelor
        colegi[0] = "Anca";
        colegi[1] = "Andra";
        colegi[2] = "Radu";
        colegi[3] = "Cristi";
        colegi[4] = "Alex";


         for (int index = 0; index <= colegi.length; index++){        //lenght: proprietate care returneaza dimensiunea lungimii unei liste
             System.out.println("Numele colegului este: " + colegi[index]);
            }
    }

    //exemplu lista:

    public void colegiCursLista(){
        //definim o multime, definim spatiu , sa ii adaug
        List<String> colegi  = new ArrayList<>();    //specificam ca este o lista de String-uri/ nu mai trebuie sa ii spunem dimensiunea elementelor, isi alocva dinamic dimensiunea
        colegi.add("Anca");
        colegi.add("Andra");
        colegi.add("Radu");

        int index = 0;
        while (index <= colegi.size()){
            System.out.println("Numele colegului este: " + colegi.get(index));
             index++;
            }
    }


    //exemplu map
    //map: cheie = valoare

    public void categoriiObiecte(){
        //1.Daca avem o colectie cheie-valaore: Definesti multimea ta -> trebuie sa ii zici cheia de care tip e si valoarea de care tip e
        HashMap<String, String> obiecte = new HashMap<>();
        //2.adaugi elementele
        obiecte.put("obiect", "laptop");
        obiecte.put("fruct", "mar");
        obiecte.put("floare", "trandafir");

        //3.Parcurgem multimea: for each- pt fiecare cheie din lista de chei
        for(String key: obiecte.keySet()){
            //4.Afisam cheia curenta
            System.out.println("Cheia este: " + key);
            //4.Afisam valoarea pe baza cheii
            System.out.println("Valoare este: " + obiecte.get(key));
        }
    }

    //array de valori a unei chei
    public void tariOrase(){
        HashMap<String, List<String>> clasificare = new HashMap<>();
        //sau: HashMap<String, List<String> clasificare = new HashMap<>();   // sau array daca e cazul de array

        //Prima data definim mai multe valori: definim o lista de orase:
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj-Napoca");
        oraseRomania.add("Brasov");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Florenta");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");
        oraseSpania.add("Malaga");

        //Trebuie HashMap
        clasificare.put("Romania", oraseRomania);
        clasificare.put("Spania", oraseSpania);
        clasificare.put("Italia", oraseItalia);

        for(String key: clasificare.keySet()){
            //4.Afisam cheia curenta
            System.out.println("Tare este: " + key);
            //4.Afisam valoarea pe baza cheii
            System.out.println("Orasele sunt: " + clasificare.get(key));
        }

    }



}





package VariabilaMetoda;

import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class StructuriAlternative {


    //structuri alternative= if-then-else; switch-case
    @Test
    public void metodaTest() {
        metodaVerificareNumar(7); //apelam metoda la care ii dam parametrul asteptat
        metodaVerificareNumar(3);
        metodaVerificareNumar(5);
        metodaVerificareNrParPozitiv(6);
        metodaVerificareNrParPozitiv(9);
        metodaVerificareNrParPozitiv(-6);
        metodaVerificareNrParPozitiv(-9);
        metodaVerificareNrParPozitiv(0);
        zileSaptamana(1);

    }

    //verificam un numar mai mare decat 5; tratam toate cele 3 cazuri: >=<

    public void metodaVerificareNumar(int valoare) {
        if (valoare > 5) {
            System.out.println("numarul " + valoare + " este mai mare decat 5");
        }
        else if (valoare < 5) {
            System.out.println("numarul " + valoare + " este mai mic decat 5");
        }
        else {
            System.out.println("numarul " + valoare + " este egal 5");
        }
    }


    public void metodaVerificareNrParPozitiv(int valoareNr) {
        //verifica daca ValoareNr e par pozitiv/negativ:
        if (valoareNr > 0) {
            //verificam daca ValoareNr e Par= divizibil cu 2
            if (valoareNr % 2 == 0) {
                System.out.println("Numarul " + valoareNr + " este par pozitiv");
            }
            else {
                System.out.println("Numarul " + valoareNr + "este impar pozitiv");
            }
        }
        //verificam daca ValoareNr e negativ:
        else if (valoareNr < 0) {
            //verificam daca ValoareNr e Par= divizibil cu 2
            if (valoareNr % 2 == 0) {
                System.out.println("Numarul " + valoareNr + " este par negativ");
            }
            else {
                System.out.println("Numarul " + valoareNr + "este inpar negativ ");
            }
        }
        //
        else if (valoareNr == 0){
            System.out.println("Numarul " + valoareNr + "este 0");

        }
    }

    //exemplu switch case
    public void zileSaptamana(Integer zi)
    {
        switch (zi)
        {
            case 1:
            case 2: //merge cases- daca avem 2 cazuri cu acelasi rezultat: facem merge
                System.out.println("Azi e luni");
                break;
            case 3:
                System.out.println("Azi e miercuri");
                break; //ca sa se opreasca dupa ce se executa actiunea de la primul caz
            case 4:
                System.out.println("Azi e joi");
                break;
            default:  // cazuri netratate
                System.out.println("Nu mai sunt zile");
        }
    }
}
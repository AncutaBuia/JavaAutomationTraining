package ObiectConstructor;

import org.testng.annotations.Test;

public class AvionTest {

    @Test
    public  void metodaTest(){
       //definim primul obiect:
        //Avion= tipul clasei
        //avion= numele obiectului
        //new Avion = se initializeaza
        // ()= aici se apeleaza constructorul
        Avion avion1 = new Avion("Pasageri", "Boeing", "B-127",
                260, "Kerosen");
        avion1.prezentareAvion(); //apelam obiectul

        Avion avion2 = new Avion("Pasageri", "Boeing", "B-180",
                300, "Eco");
        avion2.prezentareAvion();

        Avion avion3 = new Avion("Pasageri", "Boeing", "B-180",
                300, "Eco",200);
        avion3.prezentareAvion();

    //cream new branch
    }
}

package OOP;

import org.testng.annotations.Test;

//definim un obiect
public class OOPTest {

    @Test
    public void metodaTest()
    {
//        Student student1 = new Student("Buia", "Anca", 30, "Babes", "2",true);
//        student1.infoStudent();

        Angajat angajat1 = new Angajat("Buia", "Anca", 30,"Endava", "3", 21);
        angajat1.infoAngajat();

        angajat1.promovare();
        angajat1.setExperienta("5");

        angajat1.mananca();
//        student1.mananca();
        angajat1.marire();
        angajat1.marire(10);
        angajat1.marire("Senior");
    }

}

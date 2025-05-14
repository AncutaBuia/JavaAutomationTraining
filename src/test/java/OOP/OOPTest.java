package OOP;

import org.testng.annotations.Test;

//definim un obiect
public class OOPTest {

    @Test
    public void metodaTest()
    {
        Student student1 = new Student("Buia", "Anca", 30, "Babes", "2",true);
        student1.infoStudent();

        Angajat angajat1 = new Angajat("Buia", "Anca", 30,"Endava", "3", 21);
        angajat1.infoAngajat();
    }
}

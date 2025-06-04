package OOP.NonAccessModifiers.Static.ex3;

public class AngajatTest {

    //la variabilele statice folosim metode main
    public static void main(String[] args) {
        System.out.println("numar initial de angajati " + Angajat.numarAngajat);
        Angajat angajat1 = new Angajat();
        angajat1.numarAngajati();
        Angajat angajat2 = new Angajat();
        angajat2.numarAngajati();

    }
}

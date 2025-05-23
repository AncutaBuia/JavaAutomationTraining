package OOP.Abstractizare.Interfete;

import org.testng.annotations.Test;

public class OOPAbstractizareTest {


    @Test
    public void metodaTEst()
    {
        Cerc formCerc = new Cerc();   //declar si instantiez un cerc
        formCerc.setRaza(7);   //asignez valoare razei
        formCerc.calculeazaAria();


        Patrat formaPatrat = new Patrat();
        formaPatrat.setLatura(52);
        formaPatrat.calculeazaAria();

    }

}

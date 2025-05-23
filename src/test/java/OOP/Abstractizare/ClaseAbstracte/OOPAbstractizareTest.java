package OOP.Abstractizare.ClaseAbstracte;

import org.testng.annotations.Test;

public class OOPAbstractizareTest {


    @Test
    public void metodaTEst()
    {
        Cerc formCerc = new Cerc();   //declar si instantiez un cerc
        formCerc.setRaza(5);   //asignez valoare razei
        formCerc.calculeazaArie();


        Patrat formaPatrat = new Patrat();
        formaPatrat.setLatura(49);
        formaPatrat.calculeazaArie();


    }

}

package OOP.Abstractizare.ClaseAbstracte;

public abstract class FormeGometrice {

    public String culoare = "albastru";


    public abstract void calculeazaArie();  //intr-o clasa abstracta poti sa ai si o metoda abstracta pe care nu vrei sa le implementezi la nivel general ci pt cazuri specifice ex. cand avem un cerc

    public void deseneza() //intr-o clasa abstracta poti sa ai si o metoda care implementeaza ceva generic
    {
        System.out.println("Deseneaza forma");
    }

}

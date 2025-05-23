package OOP.Abstractizare.ClaseAbstracte;

public class Cerc extends FormeGometrice {

    private int raza;

    @Override
    public void calculeazaArie() {
        System.out.println("Aria cercului este egala cu: " + Math.PI*Math.pow(raza, 2));
    }

    //ca sa putem asigna in clasa test valori - ii facem getter si setter
    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
}

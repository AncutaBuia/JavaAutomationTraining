package OOP.Abstractizare.Interfete;

public interface FormeGeometrice {

    public static final String culoare = "verde"; // permite doar constante , nu si fielduri sau proprietati car enu sunt initializate

    //toate metodele declarate sunt by default abstracte (adica cand le folosim o sa le suprascriem)
    void calculeazaAria();

    void deseneaza();


}

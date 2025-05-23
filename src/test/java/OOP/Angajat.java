package OOP;

import org.openqa.selenium.devtools.v85.network.model.InterceptionId;

public class Angajat extends Persoana implements AngajatInt{

   private String firma;
   private String experienta;
   private Integer zileConcediu;


    public Angajat(String nume, String prenume, Integer varsta, String firma, String experienta, Integer zileConcediu) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experienta = experienta;
        this.zileConcediu = zileConcediu;
    }

    public void infoAngajat()
    {
        infoPersona();
        System.out.println("Firma la care lucreaza: " + firma);
        System.out.println("Anii de experienta: " + experienta);
        System.out.println("Zile totale de concediu: " + zileConcediu);
    }

    //suprascriem metoda din parinte (polimorfism dinamic)
    public void mananca()
    {
        System.out.println("Angajatul mananca cand are pauza de masa");
    }

    //polimorfism static:
    public void marire()
    {
        System.out.println("Nu avem buget de mariri");
    }
    public  void marire(Integer procent)
    {
        System.out.println("Angajatul a primit o marire cu: " + procent + "%");
    }
    public void marire(String grad)
    {
        System.out.println("Angajatul a primit gradul: " + grad);
    }


    public void promovare()
    {
        System.out.println("Angajatul cu numele " + getNume() + "a fost promovat");
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getExperienta() {
        return experienta;
    }

    public void setExperienta(String experienta) {
        this.experienta = experienta;
    }

    public Integer getZileConcediu() {
        return zileConcediu;
    }

    public void setZileConcediu(Integer zileConcediu) {
        this.zileConcediu = zileConcediu;
    }


    @Override
    public void mergeLaMunca() {
        System.out.println("Angajatul merge la munca");
    }

    @Override
    public void primesteSalariul() {
        System.out.println("Angajatul primeste salariul");
    }

    @Override
    public void mergeInPauza() {
        System.out.println("Angajatul merge in pauza");
    }

    @Override
    public void prezintaDemisie() {
        System.out.println("Angajatul nu pleaca");
    }
}

package OOP;

public class Angajat extends Persoana{

   public String firma;
   public String experienta;
   public Integer zileConcediu;

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
}

package OOP.ValueVsReferenceType.ex2;

public class MainRefTest {
    public static void main(String[] args) {
        ReferinteTest ref = new ReferinteTest();
        System.out.println(ref.name); //referinta valorii de ref "hi"
        System.out.println(ref); //referinta  ref

        ReferinteTest ref2 = new ReferinteTest();
        if(ref==ref2){
            System.out.println("egale");
        }else{
            System.out.println("referintele nu sunt egale");
        }
    }
}

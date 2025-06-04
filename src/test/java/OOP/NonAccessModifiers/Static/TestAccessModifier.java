package OOP.NonAccessModifiers.Static;

public class TestAccessModifier {

    public static void main(String[] args) {
        //In cazul static nu mai e nevoie sa declaram si instantiem obiectul
       /*StaticAccessModifier staticAccessModifier = new StaticAccessModifier();
        //System.out.println(staticAccessModifier.name);*/
        StaticAccessModifier.name = "new Endava";
        System.out.println(StaticAccessModifier.name);

        StaticAccessModifier.name = "new Endava 2";
        System.out.println(StaticAccessModifier.name);
        StaticAccessModifier.printMessage();

    }
}

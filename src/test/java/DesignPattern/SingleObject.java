package DesignPattern;

public class SingleObject {

    private static SingleObject instance = new SingleObject(); //2. instantiem alt obiect de tip private si static

    private SingleObject(){}  //1.instantiem un constructor de tip private= poate fi folosit doar in clasa respectiva

    public static SingleObject getInstance(){//mai departe folosim o metoda pt a chema obiectul respectiv ori de cate ori avem nevoie de el
        return instance;
    }

    public void showMessage() {//mai facem o metoda pt aratarea unui mesaj
        System.out.println("Hello from Singleton");
    }
}

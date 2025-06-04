package OOP.NonAccessModifiers.Syncronized;

//syncronized: este folosit pt thread safety
//syncronized midifier: este aplicat la nivel de metoda si block-uri

public class Counter {

    int count;
    synchronized void increment(){
        count++;
    }
}

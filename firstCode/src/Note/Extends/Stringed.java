package Note.Extends;

public class Stringed extends Instrument{
    void play() {System.out.println("Stringed.play()");}
    String what() {return "Stringed";}
    void adjust() {System.out.println("Adjusting Stringed");}
}
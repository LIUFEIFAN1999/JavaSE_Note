package Note.Extends;

public class Instrument {
    void play() {System.out.println("Instrument.play()");}
    String what() {return "Instrumrnt";}
    public String toString() {
        return what();
    }
    void adjust() {System.out.println("Adjusting Instrument");}
}

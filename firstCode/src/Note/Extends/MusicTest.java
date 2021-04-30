package Note.Extends;

public class MusicTest {
    public static void tune(Instrument i) {
        i.play();
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
        Instrument test = new Wind();
        System.out.println(test);
        System.out.println(test.toString());
    }
}

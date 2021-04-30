package Note.Extends.Override;

import java.io.FileNotFoundException;

public class Son extends Father{
    @Override
    void say() throws FileNotFoundException {
        System.out.println("I'm son");
    }
}

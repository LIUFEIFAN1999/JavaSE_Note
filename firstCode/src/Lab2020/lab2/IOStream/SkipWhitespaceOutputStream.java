package Lab2020.lab2.IOStream;

import java.io.*;

public class SkipWhitespaceOutputStream extends OutputStream{


    public void write(String string) throws IOException {
        string = string.replaceAll(" ", "");
        System.out.println(string);
    }

    @Override
    public void write(int b) throws IOException {

    }
}

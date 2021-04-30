package Note.CommonClass;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String[] args) {
        double number = 23562528;
        NumberFormat nf1 = NumberFormat.getInstance(Locale.CHINA);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CANADA);
        System.out.println(nf1.format(number));
        System.out.println(nf2.format(number));
    }
}

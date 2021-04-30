package Note.CommonClass;

import java.text.DecimalFormat;

public class DecimalFormatTest {
    public static void main(String[] args) {
        double number1 = 0.123223;
        int number2 = 12345;
        DecimalFormat df1 = new DecimalFormat("#,###");
        DecimalFormat df2 = new DecimalFormat("#.00");
        DecimalFormat df3 = new DecimalFormat("0.##%");
        System.out.println(df1.format(number2));
        System.out.println(df2.format(number1));
        System.out.println(df3.format(number1));
    }
}

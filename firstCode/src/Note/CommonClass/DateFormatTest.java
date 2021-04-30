package Note.CommonClass;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    public static void main(String[] args) {
        Date today = new Date();
        Locale locale = Locale.CHINA;
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println(df.format(today));
    }
}

package Note.CommonClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        String birthday = "1999-12-29";
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Date bir = sd.parse(birthday);//将字符串日期转换为Date类型
        System.out.println(bir);
    }
}

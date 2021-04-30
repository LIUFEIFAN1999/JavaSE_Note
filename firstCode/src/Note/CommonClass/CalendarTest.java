package Note.CommonClass;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020,11,25);//月份从0开始，11代表12月
        calendar.set(Calendar.DAY_OF_WEEK,6);//这个星期里面的第六天，也就是周五（从星期天开始）
        Date date = calendar.getTime();
        System.out.println(calendar);//calendar的toString方法是将所有属性输出，并不显示正常的日期
        System.out.println(date);
    }
}

package Note.CommonClass;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerTest {
    static String data =
            "58.27.82.16@02/10/2020\n" +
                    "23.43.42.2@23/10/2020\n" +
                    "33.213.410.2@24/10/2020\n"+
                    "23.43.222.2@23/11/2020\n";
    public static void main(String[] args) {
        //Scanner Regex
        Scanner scanner2 = new Scanner(data);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@" + "(\\d{2}/\\d{2}/\\d{4})";
        while(scanner2.hasNext(pattern)) {
            scanner2.next(pattern);
            MatchResult matchResult = scanner2.match();
            String ipString = matchResult.group(1);
            String dataString = matchResult.group(2);
            System.out.format("Threat on %s from %s\n",dataString,ipString);
        }
        //Scanner
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt())
            System.out.println(scanner.nextInt());
    }
}

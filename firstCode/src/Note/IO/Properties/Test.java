package Note.IO.Properties;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        File file = new File("D:/Test/config.properties");
        Properties prop = new Properties();
        prop.put("font-size","14px");
        prop.put("color","black");
        try{
            prop.store(new FileOutputStream(file), "配置文件注释");
        }catch (IOException e){
            System.out.println("存储失败");
        }
    }
}

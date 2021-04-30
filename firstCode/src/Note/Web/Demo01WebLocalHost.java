package Note.Web;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo01WebLocalHost {
    public static void main(String[] args) throws UnknownHostException {
        //获取本地主机ip
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());
        System.out.println(localHost.getCanonicalHostName());

        //获取主机ip
        InetAddress sohuHost = InetAddress.getByName("www.sohu.com");
        System.out.println(sohuHost.getHostName());
        System.out.println(sohuHost.getHostAddress());
        System.out.println(sohuHost.getCanonicalHostName());
    }
}

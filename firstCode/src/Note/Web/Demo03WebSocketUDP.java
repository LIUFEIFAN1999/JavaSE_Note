package Note.Web;

import java.io.IOException;
import java.net.*;

public class Demo03WebSocketUDP {
    public static void main(String[] args) throws IOException {
        DatagramSocket udp = new DatagramSocket(8888);
        String s = "你好，朋友啊";
        DatagramPacket data = new DatagramPacket(s.getBytes(),s.getBytes().length, InetAddress.getLocalHost(),7777);
        udp.send(data);
        udp.close();
    }
}

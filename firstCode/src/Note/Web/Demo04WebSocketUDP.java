package Note.Web;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo04WebSocketUDP {
    public static void main(String[] args) throws IOException {
        DatagramSocket udp = new DatagramSocket(7777);
        DatagramPacket data = new DatagramPacket(new byte[100],100, InetAddress.getLocalHost(),8888);
        udp.receive(data);
        String s = new String(data.getData(),0,data.getLength());
        System.out.println("接受内容："+s);
        udp.close();
    }
}

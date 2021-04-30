package Note.Web;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo02SocketTCP {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(3333);
        System.out.println("等待客户连接...");
        Socket client = server.accept();
        System.out.println("有客户请求，请向客户端发送数据...");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        writer.write("<BODY>这是服务器反馈的<B>数据</B></BODY>");
        writer.flush();
        client.close();
        server.close();
    }
}

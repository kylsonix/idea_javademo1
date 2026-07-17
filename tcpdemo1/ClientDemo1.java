package tcpdemo1;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：实现tcp通信下一发一收：客户端开发
        //1、常见的Socket管道对象，请求与服务端的Socket链接，可靠链接

        Socket socket = new Socket("172.0.0.1", 9999);
        OutputStream os = null;
        try {
            os = socket.getOutputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //2、从Socket管道中获取一个字节输出流
        //3、特殊的字节输出流，写数据出去
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("hello,server");
        

        socket.close();

    }
}

package Question7.UDP;

import java.net.*;
import java.io.*;

public class UDPChatClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        byte[] sendByte = new byte[512];
        byte[] recByte = new byte[512];

        do{
            System.out.print("Enter Your Message: ");
            String clientMessage = in.readLine();
            sendByte = clientMessage.getBytes();
            DatagramPacket dout = new DatagramPacket(sendByte, sendByte.length, ip, 2000);
            ds.send(dout);
            if(clientMessage.equals("stop")){
                System.out.println("Exiting...");
                break;
            }

            DatagramPacket din = new DatagramPacket(recByte, recByte.length);
            ds.receive(din);
            String serverMessage = new String(din.getData(),0,din.getLength());
            System.out.println("Server Message: "+serverMessage);
        }while(true);
        ds.close();
    }
}

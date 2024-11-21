package Question7.UDP;

import java.io.*;
import java.net.*;

public class UDPChatServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(2000);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte[] sendByte = new byte[512];
        byte[] recByte = new byte[512];

        do{
            DatagramPacket din = new DatagramPacket(recByte, recByte.length);
            ds.receive(din);
            String clientMessage = new String(din.getData(),0,din.getLength());
            if(clientMessage.equals("stop")){
                System.out.println("Exiting...");
                break;
            }
            System.out.println("Clinet Message: "+clientMessage);

            System.out.println("Enter your message: ");
            String serverMessage = br.readLine();
            sendByte = serverMessage.getBytes();
            DatagramPacket dout = new DatagramPacket(sendByte, sendByte.length, din.getAddress(), din.getPort());
            ds.send(dout);
        }while (true);
        ds.close();
    }
}

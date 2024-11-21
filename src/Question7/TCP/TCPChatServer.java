package Question7.TCP;

import java.io.*;
import java.net.*;

public class TCPChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(2000);
        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        String serverMessage="";
        String clientMessage="";

        while(!clientMessage.equals("stop")){
            clientMessage = din.readUTF();
            System.out.println("clientMessage: "+clientMessage);

            System.out.println("Enter your message: ");
            serverMessage=br.readLine();
            dout.writeUTF(serverMessage);
            dout.flush();
        }
        din.close();
        dout.close();
        ss.close();
    }
}

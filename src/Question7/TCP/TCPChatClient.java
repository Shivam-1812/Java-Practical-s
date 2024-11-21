package Question7.TCP;

import java.io.*;
import java.net.*;

public class TCPChatClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("Localhost", 2000);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        String clientMessage="";
        String serverMessage="";

        while(!clientMessage.equals("stop")){
            System.out.println("Enter your message:");
            clientMessage = br.readLine();
            dout.writeUTF(clientMessage);
            dout.flush();

            serverMessage = din.readUTF();
            System.out.println("Server Message: "+serverMessage);
        }
        din.close();
        dout.close();
        s.close();
    }
}

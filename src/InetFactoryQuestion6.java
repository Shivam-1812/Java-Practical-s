import java.net.*;

public class InetFactoryQuestion6 {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println("IP address of Local Machine: " + InetAddress.getLocalHost());
        System.out.println("IP address of google.com: " + InetAddress.getByName("google.com"));
        System.out.println("IP addresses of yahoo.com: ");
        InetAddress[] netad = InetAddress.getAllByName("yahoo.com");

        for (InetAddress i : netad) {
            System.out.println("IP: "+i);
        }
    }
}

import java.net.*;

public class URLConnectionDemoQuestion8 {
    public static void main(String[] args) throws Exception {
        URL obj = new URL("http://msbte.org");
        System.out.println("Host Name: "+obj.getHost());
        System.out.println("Protocol Name: "+obj.getProtocol());
        System.out.println("Port No.: "+obj.getPort());
        System.out.println("File: "+obj.getFile());

        URLConnection con = obj.openConnection();
        System.out.println("Content Length: "+con.getContentLength());
        System.out.println("Content Type: "+con.getContentType());
    }
}

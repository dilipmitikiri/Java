package programs;

import java.net.InetAddress;

public class IPAddressFromSiteUrl {
    public static void main(String[] args) {
        try {
            InetAddress it = InetAddress.getByName("https://www.facebook.com/");
            System.out.println("Host Name: " + it.getHostName());
            System.out.println("IP Address: " + it.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

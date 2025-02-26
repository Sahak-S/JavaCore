package javadas.grup1.internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyLocal {
    public static void main(String[] args) {
        InetAddress myIP = null;
        try {
            myIP = InetAddress.getLocalHost();
        }catch (UnknownHostException e){
            System.out.println("սխալ մուտք -> " + e);
        }
        System.out.println("իմ  IP -> " + myIP);
        System.out.println();


        InetAddress myIP1 = null;
        myIP1 = InetAddress.getLoopbackAddress();
        System.out.println("իմ IP -> " + myIP1);

    }
}

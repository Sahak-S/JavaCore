package packagesAnderfaces.Interfaces;

import java.nio.channels.InterruptibleChannel;

public class Client implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Meтoд callback()," + "вызываемый со значением" + p);


        }
        void nonifaceMeth(){
            System.out.println("B классах, реализующих интерфейсы," + "могут определяться и другие члены.");
    }
}

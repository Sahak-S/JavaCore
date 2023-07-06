package grup1.error.test;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class NewClass {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        ObjectOutputStream oOut = new ObjectOutputStream(bOut);
        Whole object = new Whole();
        oOut.writeObject(object);
    }


}

class Whole implements Serializable {
    public void writeObject(ObjectOutputStream out) {
        System.out.println("Whole.writeObject()");
    }
}

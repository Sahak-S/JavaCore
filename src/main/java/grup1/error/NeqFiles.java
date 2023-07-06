package grup1.error;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NeqFiles {

    public static void main(String[] args) {

        Path testFilePath = Paths.get("C:\\Users\\User\\Desktop\\java\\Новая папка\\Новая папка1\\doc1");


        Path fileName = testFilePath.getFileName();                           //  կտպի եկող վերջին պապկի անունը
        System.out.println(fileName);

        Path parent = testFilePath.getParent();                              //  կտպի մինչև ֆաիլը գտնող պապկեն
        System.out.println(parent);

        Path root = testFilePath.getRoot();                                  //  կտպի լոկալ դիսկը
        System.out.println(root);

        boolean endWithTxt = testFilePath.endsWith("doc1");                 //  կստուգի եթե վերջին պապկեն կհամապատասխանի
        System.out.println(endWithTxt);                                     // կտպի ճիշտէ եթե ոչ սխալ
        if (endWithTxt == true) {                                           // եթե պայմանն համապատասխանեծ կտպի ընդհանուր Path
            System.out.println(testFilePath);
        } else {
            System.out.println("sorry not doc file");
        }

        boolean startsWithLalala = testFilePath.startsWith("C:");
        System.out.println(startsWithLalala);

        URI path = testFilePath.toUri();
        System.out.println(path);

//        Path system = testFilePath.getName("index");
//        System.out.println(system);
    }
}

package javadas.grup1;

public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("Օպերատորի տեղեկատու :");
            System.out.println("1․if ");
            System.out.println("2. swich");
            System.out.println("3. while");
            System.out.println("4. du-while");
            System.out.println("5. for\n");
            System.out.println("Ընտրեք համապատասղան կոճակը :");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");
        switch (choice) {
            case '1':
            System.out.println("if:\n");
            System.out.println("if(պայման) օպերատոր;");
            System.out.println("else օպերատոր;");
            break;
            case '2':
                System.out.println("swich:\n");
                System.out.println("swich (առտահայտություն) {");
                System.out.println(" case կոնստանտ։");
                System.out.println("հաջորդականությունը օպերատորների");
                System.out.println("break;");
                System.out.println("// ...");
                System.out.println(" }");
                break;
            case '3':
                System.out.println("whale:\n");
                System.out.println("whaie (պայման) օպերատոր;");
                break;
            case '4':
                System.out.println("du-waile:\n");
                System.out.println("du {");
                System.out.println(" օպերատոր;");
                System.out.println(" } while (պայման);");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("for (նախաստորագրում;պայման;կրկնություն)");
                System.out.println("օպերատոր;");
                break;


        }
    }
}


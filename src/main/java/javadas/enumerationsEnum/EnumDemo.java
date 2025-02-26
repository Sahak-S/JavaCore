package javadas.enumerationsEnum;

public class EnumDemo {
    public static void main(String[] args) {

        Apple ap;
        ap = Apple.REDDEL;
        System.out.println("ap = " + ap);
        System.out.println();

        ap = Apple.GOLDENDEL;
        // сравнить два значения перечислимого типа
        if (ap == Apple.GOLDENDEL) {
            System.out.println("Переменная ар содержит GoldenDel.\n");
        }

        // применить перечисление для управления

        switch (ap) {
            case JONATHAN:
                System.out.println("Copт Jonathan красный.");
                break;
            case GOLDENDEL:
                System.out.println("Сорт Golden Delicious желтый.");
                break;
            case REDDEL:
                System.out.println("Copт Red Delicious красный.");
                break;
            case WINESAP:
                System.out.println("Copт Winesap красный.");
                break;
            case CORTLAND:
                System.out.println("Copт Cortland красный.");
                break;
        }
    }
}
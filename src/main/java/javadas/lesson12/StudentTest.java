package javadas.lesson12;

public class StudentTest {

    public static void main(String[] args) {


        Student poxos = new Student("Poxos", "Poxosyan",
                "094484797", 28, "java","AH845132");
        System.out.println(poxos.getName());

        poxos.setName("poxosik");
        System.out.println(poxos.getName());
        System.out.println(poxos.getSurnname());
        System.out.println(poxos.setPhonNumber("094484797"));
        System.out.println(poxos.toString());
    }
}

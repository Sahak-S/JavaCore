package javadas.practicke;

public class A{
    public static void main(String[] args) {
        String s; // 1
        if ((s = "java") == "java") {// 2
            System.out.println (s+ " true");
        } else {
            System.out.println (s+ " false");
        }
    }
}

package javadas.treatmentExclusion;

public class ExceptionDemo {

    static void compute(int a) throws MyException{
        System.out.println("Bызвaн метод compute(" + a + ")");
        if (a > 10){
            throw new MyException(a);
        }
        System.out.println("Hopмaльнoe завершение");
    }
    public static void main(String[] args) {

        try {
            compute(10);
            compute(20);
        }catch (MyException e){
            System.out.println("Пepexвaчeнo исключение: " + e);
        }
    }

}

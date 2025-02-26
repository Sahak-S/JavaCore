package javadas.classesofmethods;

public class Overlod1 {

    void test(){
        System.out.println("Կարգաորումը բացակայում է");
    }
    void test(int a,int b){
        System.out.println("a & b :" + a + " " + b);

    }
    void test(double a){
        System.out.println("Bнyтpeннee преобразование при вызове " + "test(double a):" + a);
    }
}

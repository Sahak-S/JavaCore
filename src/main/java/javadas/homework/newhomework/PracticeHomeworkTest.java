package javadas.homework.newhomework;

public class PracticeHomeworkTest {

    public static void main(String[] args) {

        PracticeHomework practiceHomework = new PracticeHomework();
        PracticeHomework practiceHomework1 = new PracticeHomework();
        PracticeHomework practiceHomework2 = new PracticeHomework();

        System.out.println(practiceHomework.convert(25));
        System.out.println(practiceHomework.calcAge(5));
        System.out.println(practiceHomework.nextNumber(6));
        System.out.println(practiceHomework.isSameNum(10,20));
        System.out.println(practiceHomework.reverseBool(true));


        int[] array1 = {1,2,3,4,5,6,7};
        int[] array2 = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(practiceHomework.maxLength(array1,array2));
    }
}

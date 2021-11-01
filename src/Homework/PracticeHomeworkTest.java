package Homework;

public class PracticeHomeworkTest {

    public static void main(String[] args) {

        PracticeHomework practiceHomework = new PracticeHomework();

        System.out.println(practiceHomework.convert(15) + " վարկյան է");
        System.out.println(practiceHomework.calcAge(10) + " օր է");
        System.out.println(practiceHomework.nextNumber(4) + " հաջորդ թիվ է");
        System.out.println(practiceHomework.isSameNum(10,15));
        //System.out.println(practiceHomework.SameNum(10,10));
        System.out.println(practiceHomework.lessThanOrEqualToZero(-1));
        System.out.println(practiceHomework.reverseBool(false));

        PracticeHomework practiceHomework1 = new PracticeHomework();
        PracticeHomework practiceHomework2 = new PracticeHomework();

        int[] array1 = {1,2,3,4,5,6,7};
        int[] array2 = {0,1,2,3,4,5,6,7,8,9};


        System.out.println(practiceHomework.maxLength(array1,array2) + " maxlength");














    }
}

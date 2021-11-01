package Homework;

public class PracticeHomework {

    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    long convert(int minuts) {
        long second = minuts * 60;
        return second;
    }

    //ընդունել տարին, վերադարձնել օրերի քանակը։
    int calcAge(int years) {
        int dey = years * 365;
        return dey;
    }

    //վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int number) {

        int nextNumber = number + 1;
        return nextNumber;

    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false

    boolean issamenum;

    boolean isSameNum(int a, int b) {
        if (a == b) {
            issamenum = true;
        } else {
            issamenum = false;
        }
        return issamenum;
    }

    //  Չգիտեմ ճիշտ կարելի է համարել այս օրինակը թե չէ
 /*   boolean samenum;
    boolean SameNum(int a, int b) {
        if (a == b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return samenum;
    }
*/

    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
    //մնացած դեպքերում վերադարձնել false

    boolean num;

    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            num = true;
        } else num = false;
        return num;

    }
    //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։


    boolean reverseBool(boolean value) {
        if (value == true) {
            value = false;
        } else if (value == false) ;
        value = true;
        return value;
    }

    //վերադարձնել երկու մասիվի ամենամեծ length-ը

    int[] array1 ;
    int[] array2 ;
    int length;

    int maxLength(int[]array1,int[]array2){
        if (array1.length > array2.length){
            length = array1.length;
        }else if (array2.length > array1.length){
            length = array2.length;
        }
        return length;

    }

}

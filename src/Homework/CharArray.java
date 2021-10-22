package Homework;

public class CharArray {
    public static void main(String[] args) {
        //տվյալ մասիվը պետք է դասավորել մինիմումից մակսիմում
        int[] array = {7, 12, 54, 0, -4, 44, 17, 88, 4};

        for (int i = 0; i < array.length; i++) { // մասիվի էլեմենտների քաննակն է i 0_ից մինցհեվ i 8: Ընդհանուր մասիվի քանակը 9 է
            int file = array[i];      // file մեջ պահեցինք մասիվի առաջին ինդեքսը,   հետագայում դասաորում ըստ հերտականության
            for (int j = i - 1; j >= 0; j--) {  // 2_րդ ցիկլով ման եկանք ամենափոքր արժեքը
                int file1 = array[j];   // համեմատեցինք նախորդ արժեքի հետ
                if (file < file1) {      // երբ որ գտնում է նախորդ թվից պոքր թիվ կատարում է համապատասխան գործողություն
                    array[j + 1] = file1;
                    array[j] = file;

                }

            }

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}

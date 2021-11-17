package author0011;

import author.Author;
import author.AuthorStorage;

import java.util.Scanner;

public class AuthorTest0011 {

    public static void main(String[] args) {

        AuthorStorage0011 authorStorage0011 = new AuthorStorage0011();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many authors do you have?");
        System.out.println("Քանի՞ հեղինակ ունեք։");
        int numOfAuthors0011 = scanner.nextInt();
        for (int i = 0; i < numOfAuthors0011; i++) {
            System.out.println("Please enter name of author");
            System.out.println("Խնդրում ենք մուտքագրել հեղինակի անունը:");
            String Անունը = scanner.next();
            System.out.println("Please enter surname of author");
            System.out.println("Խնդրում ենք մուտքագրել հեղինակի ազգանունը:");
            String Ազգանուն = scanner.next();
            System.out.println("Please enter e-mail of author");
            System.out.println("Խնդրում ենք մուտքագրել հեղինակի էլ. հասցեն (email):");
            String Էլհասցե = scanner.next();
            System.out.println("Please enter age of author");
            System.out.println("Խնդրում ենք մուտքագրել հեղինակի տարիքը:");
            int տարիքը = scanner.nextInt();
            System.out.println("please enter gender of author (M or F)");
            System.out.println("Խնդրում ենք մուտքագրել հեղինակի սեռը (Ա կամ Ի)");
            String սեռը = scanner.next();

            Author0011 author0011 = new Author0011(Անունը,Ազգանուն,Էլհասցե,տարիքը,սեռը);
            authorStorage0011.add(author0011);
            authorStorage0011.getByIndex(i);

        }
        authorStorage0011.print();

    }
}

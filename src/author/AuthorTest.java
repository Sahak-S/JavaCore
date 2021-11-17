package author;

import java.util.Scanner;

public class AuthorTest {

    public static void main(String[] args) {

        AuthorStorage authorStorage = new AuthorStorage();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many authors do you have?");
        System.out.println("Քանի՞ հեղինակ ունեք։");
        int numOfAuthors = scanner.nextInt();
        for (int i = 0; i < numOfAuthors; i++) {
            System.out.println("Please enter name of author");
            System.out.println("Խնդրում ենք մուտքագրել հեղինակի անունը:");
            String name = scanner.next();
            System.out.println("Please enter surname of author");
            System.out.println("Խնդրում ենք մուտքագրել հեղինակի ազգանունը:");
            String surname = scanner.next();
            System.out.println("Please enter e-mail of author");
            System.out.println("Խնդրում ենք մուտքագրել հեղինակի էլ. հասցեն (email):");
            String email = scanner.next();
            System.out.println("Please enter age of author");
            System.out.println("Խնդրում ենք մուտքագրել հեղինակի տարիքը:");
            int age = scanner.nextInt();
            System.out.println("Please enter gender of author (M or F)");
            System.out.println("Խնդրում ենք մուտքագրել հեղինակի սեռը (Ա կամ Ի)");
            String gender = scanner.next();


            Author author = new Author(name, surname, email, age, gender);
            authorStorage.add(author);
            authorStorage.getByIndex(i);
        }
        authorStorage.print();
    }

}

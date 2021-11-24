package author;

import java.util.Scanner;

public class AuthorTest {

    private static final Scanner scanner = new Scanner(System.in);
    private static final AuthorStorage authorStorage = new AuthorStorage();
    private static final BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHORS = "3";
    private static final String SEARCH_AUTHORS_BY_AGE = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String PRINT_AUTHORS = "6";
    private static final String PRINT_BOOKS = "7";
    private static final String SEARCH_BOOKS_BY_AUTHOR = "8";
    private static final String COUNT_BOOKS_BY_AUTHOR = "9";
    private static final String CHANGE_AUTHOR = "10";
    private static final String CHANGE_BOOK_AUTHOR = "11";

    public static void main(String[] args) {

        bookStorage.add(new Book("Hamlet", "tragedy","5000",10));
        authorStorage.add(new Author("William", "Shakespeare", "Shakspir@mail.ru", 420, "male"));
        authorStorage.add(new Author("poxos", "poxosyan", 22, "poxos@mail.com", "male"));
        authorStorage.add(new Author("poxosuhi", "poxosyan", 33, "poxosuhi@mail.com", "female"));
        authorStorage.add(new Author("petros", "petrosyan", 45, "petros@mail.com", "male"));


        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchByEmail();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countByAuthor();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBookAuthor();
                    break;
                default:
                    System.out.println("Invalid command!");
            }

        }
    }

    private static void changeBookAuthor() {
        System.out.println("please input book title");
        String title = scanner.nextLine();
        Book book = bookStorage.getTitle(title);
        if (book != null) {
            System.out.println("please input email");
            String email = scanner.nextLine();
            Author author = authorStorage.getByEmail(email);
            if (author != null) {
                book.setAuthor(author);
                System.out.println("Thank you , author was changed");
                System.out.println("Շնորհակալություն  հեղինակը փոխվել է");

            } else {
                book.setAuthor(addAuthor());
            }
        } else {
            System.out.println("invalid title");
            changeBookAuthor();
        }
    }


    private static void changeAuthor() {

        System.out.println("please input email");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input new authors name");
            String name = scanner.nextLine();
            author.setName(name);
            System.out.println("please input new authors surname");
            String surname = scanner.nextLine();
            author.setSurname(surname);
            System.out.println("please input new authors age");
            int age = Integer.parseInt(scanner.nextLine());
            author.setAge(age);
            System.out.println("please input new authors gender");
            String gender = scanner.nextLine();
            author.setGender(gender);

        } else {
            changeAuthor();
        }
    }

    private static void countByAuthor() {
        System.out.println("please input authors email ");
        String email = scanner.nextLine();
        bookStorage.countByAuthor(email);

    }


    private static void searchByEmail() {
        System.out.println("please input author's email");
        System.out.println("խնդրում ենք մուտքագրել հեղինակի էլ.հասցե");
        String email = scanner.nextLine();
        bookStorage.searchByEmail(email);
    }


    private static void searchBooksByTitle() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByTitle(keyword);
    }

    private static void addBook() {

        System.out.println("please choose author's email");
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input book's title");
            String title = scanner.nextLine();
            System.out.println("please input book's description");
            String description = scanner.nextLine();
            System.out.println("please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count");
            int count = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, description, price, count, author);

            bookStorage.add(book);

            System.out.println("Thank you, Book was added");
        } else {
            System.out.println("invalid email! please try again");
            addBook();
        }

    }

    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void printCommands() {
        System.out.println("\u001B[34m" + "please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("please input " + SEARCH_BOOKS_BY_TITLE + " for search book by title");
        System.out.println("please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("please input " + PRINT_BOOKS + " for print books");
        System.out.println("please input " + SEARCH_BOOKS_BY_AUTHOR + " for search book by author");
        System.out.println("please input " + COUNT_BOOKS_BY_AUTHOR + " for count book by author");
        System.out.println("please input " + CHANGE_AUTHOR + " for change author");
        System.out.println("please input " + CHANGE_BOOK_AUTHOR + " for change book`s author" + "\u001B[0m");
    }

    private static void searchByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static Author addAuthor() {
        System.out.println("please input author's name");
        String name = scanner.nextLine();
        System.out.println("please input author's surname");
        String surname = scanner.nextLine();
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        System.out.println("please input author's gender");
        String gender = scanner.nextLine();
        System.out.println("please input author's age");
        int age = Integer.parseInt(scanner.nextLine());

        Author author = new Author(name, surname, age, email, gender);
        if (authorStorage.getByEmail(author.getEmail()) != null) {
            System.err.println("Invalid email. An author already exists at this email address. Enter another email address");
            System.out.println("Սխալ Էլեկտրոնային փոստի հասցե. Այս էլ փոստի հասցեում հեղինակն արդեն գոյություն ունի: Մուտքագրեք այլ էլ փոստի հասցե");
        } else {
            authorStorage.add(author);
            System.out.println("Thank you, author was added");
            System.out.println("Շնորհակալություն, հեղինակն ավելացվեց");
        }

        return author;
    }
}
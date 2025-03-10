//package javadas.homework.newhomework.author;
//
//
//
//import javadas.author.util.DateUtil;
//import javadas.homework.newhomework.author.model.User;
//import javadas.homework.newhomework.author.exception.BookNotFoundException;
//import javadas.homework.newhomework.author.model.Author;
//import javadas.homework.newhomework.author.model.Book;
//import javadas.homework.newhomework.author.model.Gender;
//import javadas.homework.newhomework.author.model.UserType;
//import javadas.homework.newhomework.author.storage.AuthorStorage;
//import javadas.homework.newhomework.author.storage.BookStorage;
//import javadas.homework.newhomework.author.storage.UserStorage;
//
//import java.text.ParseException;
//import java.util.Date;
//import java.util.Scanner;
//
//public class AuthorTest implements AuthorBookComabds {
//    static Scanner scanner = new Scanner(System.in);
//    static AuthorStorage authorStorage = new AuthorStorage();
//    static BookStorage bookStorage = new BookStorage();
//    static UserStorage userStorage = new UserStorage();
//
//    public static void main(String[] args) {
//        initData();
//        boolean isRun = true;
//
//        while (isRun) {
//            AuthorBookComabds.printCommands();
//            String command = scanner.nextLine();
//            switch (command) {
//                case EXIT:
//                    isRun = false;
//                    break;
//                case LOGIN:
//                    login();
//                    break;
//                case REGISTER:
//                    register();
//                    break;
//                default:
//                    System.out.println("Invalid command!");
//            }
//        }
//    }
//
//
//    private static void login() {
//        System.out.println("please input email");
//        String email = scanner.nextLine();
//        User byEmail = userStorage.getByEmail(email);
//        if (byEmail != null) {
//            System.out.println("please input password");
//            String password = scanner.nextLine();
//            if (byEmail.getPassword().equals(password)) {
//
//
//                if (byEmail.getType() == UserType.ADMIN) {
//                    adminLogin();
//
//                } else if (byEmail.getType() == UserType.USER) {
//                    userLogin();
//                }
//            } else {
//                System.out.println("password is wrong!");
//            }
//        } else {
//            System.err.println("user with " + email + " does not exists");
//
//        }
//    }
//
//    private static void userLogin() {
//        boolean isRun = true;
//        while (isRun) {
//            AuthorBookComabds.printUserCommands();
//            String command = scanner.nextLine();
//            switch (command) {
//                case EXIT:
//                    System.exit(0);
//                    break;
//                case ADD_AUTHOR:
//                    addAuthor();
//                    break;
//                case ADD_BOOK:
//                    addBook();
//                    break;
//                case SEARCH_AUTHORS:
//                    searchByName();
//                    break;
//                case SEARCH_AUTHORS_BY_AGE:
//                    searchByAge();
//                    break;
//                case SEARCH_BOOKS_BY_TITLE:
//                    searchBooksByTitle();
//                    break;
//                case PRINT_AUTHORS:
//                    authorStorage.print();
//                    break;
//                case PRINT_BOOKS:
//                    bookStorage.print();
//                    break;
//                case SEARCH_BOOKS_BY_AUTHOR:
//                    searchBooksByAuthor();
//                    break;
//                case COUNT_BOOKS_BY_AUTHOR:
//                    countBooksByAuthor();
//                    break;
//                case LOGOUT:
//                    isRun = false;
//                    break;
//                default:
//                    System.out.println("Invalid command!");
//            }
//        }
//
//    }
//
//    private static void register() {
//        System.out.println("please input email");
//        String email = scanner.nextLine();
//        User byEmail = userStorage.getByEmail(email);
//        if (byEmail == null) {
//            System.out.println("Please input name");
//            String name = scanner.nextLine();
//
//            System.out.println("Please input surname");
//            String surname = scanner.nextLine();
//
//            System.out.println("Please input password");
//            String password = scanner.nextLine();
//
//            System.out.println("Please input type(ADMIN,USER)");
//            String type = scanner.nextLine();
//
//            User user = new User();
//            user.setEmail(email);
//            user.setName(name);
//            user.setSurname(surname);
//            user.setPassword(password);
//            user.setType(UserType.valueOf(type.toUpperCase()));
//            userStorage.add((javadas.author.model.User) user);
//            System.out.println("User was registered!");
//        } else {
//            System.err.println("user with " + email + " already exists");
//        }
//    }
//
//
//    private static void adminLogin() {
//        boolean isRun = true;
//        while (isRun) {
//            AuthorBookComabds.printAdminCommands();
//            String command = scanner.nextLine();
//            switch (command) {
//                case EXIT:
//                    System.exit(0);
//                    break;
//                case ADD_AUTHOR:
//                    addAuthor();
//                    break;
//                case ADD_BOOK:
//                    addBook();
//                    break;
//                case SEARCH_AUTHORS:
//                    searchByName();
//                    break;
//                case SEARCH_AUTHORS_BY_AGE:
//                    searchByAge();
//                    break;
//                case SEARCH_BOOKS_BY_TITLE:
//                    searchBooksByTitle();
//                    break;
//                case PRINT_AUTHORS:
//                    authorStorage.print();
//                    break;
//                case PRINT_BOOKS:
//                    bookStorage.print();
//                    break;
//                case SEARCH_BOOKS_BY_AUTHOR:
//                    searchBooksByAuthor();
//                    break;
//                case COUNT_BOOKS_BY_AUTHOR:
//                    countBooksByAuthor();
//                    break;
//                case CHANGE_AUTHOR:
//                    changeAuthor();
//                    break;
//                case CHANGE_BOOK_AUTHOR:
//                    changeBookAuthor();
//                    break;
//                case DELETE_AUTHOR:
//                    deleteAuthor();
//                    break;
//                case DELETE_BOOK:
//                    deleteBook();
//                    break;
//                case DELETE_BOOK_BY_AUTHOR:
//                    deleteBookByAuthor();
//                    break;
//                case ADD_TAGS_TO_BOOK:
//                    addTagsToBook();
//                    break;
//                case REMOVE_TAGS_FROM_BOOK:
//                    removeTagsToBook();
//                    break;
//                case LOGOUT:
//                    isRun = false;
//                    break;
//                default:
//                    System.out.println("Invalid command!");
//            }
//
//        }
//
//    }
//
//
//    private static void removeTagsToBook() {
//        System.out.println("please choose book by serial id");
//        System.out.println("խնդրում ենք ընտրել գիրքը ըստ սերիական id-ի");
//        System.out.println("--------");
//        bookStorage.print();
//        System.out.println("--------");
//        String serialId = scanner.nextLine();
//        Book book = null;
//        try {
//            book = bookStorage.getBySerialId(serialId);
//            System.out.println("please input tags separate ,");
//            System.out.println("խնդրում ենք մուտքագրել թեգերը առանձին ,");
//            String tagsStr = scanner.nextLine();
//            String[] tagsToRemove = tagsStr.split(",");
//            String[] bookTags = book.getTags();
//            if (bookTags == null) {
//                System.err.println("Book does not have any tags to remove!");
//                System.out.println("Գիրքը հանելու պիտակներ չունի:");
//            } else {
//                for (String tag : tagsToRemove) {
//                    boolean isExist = false;
//                    for (String bookTag : bookTags) {
//                        if (bookTag.equals(tag)) {
//                            isExist = true;
//                            break;
//                        }
//                    }
//                    if (!isExist) {
//                        System.err.println(tag + " does not exists on book: " + book);
//                        System.out.println(tag + " գրքում գոյություն չունի. " + book);
//                        return;
//                    }
//                }
//                String[] newTags = new String[bookTags.length - tagsToRemove.length];
//                int index = 0;
//                for (String bookTag : bookTags) {
//                    boolean isExist = false;
//                    for (String toRemove : tagsToRemove) {
//                        if (bookTag.equals(toRemove)) {
//                            isExist = true;
//                            break;
//                        }
//                    }
//                    if (!isExist) {
//                        newTags[index++] = bookTag;
//                    }
//                }
//                book.setTags(newTags);
//
//            }
//        } catch (javadas.author.exception.BookNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    private static void addTagsToBook() {
//        System.out.println("please choose book by serial id");
//        System.out.println("խնդրում ենք ընտրել գիրքը ըստ սերիական id-ի");
//        System.out.println("--------");
//        bookStorage.print();
//        System.out.println("--------");
//        String serialId = scanner.nextLine();
//        Book book = null;
//        try {
//
//            book = bookStorage.getBySerialId(serialId);
//            System.out.println("please input tags separate ,");
//            System.out.println("խնդրում ենք մուտքագրել պիտակները առանձին");
//            String tagsStr = scanner.nextLine();
//            String[] tags = tagsStr.split(",");
//            String[] bookTags = book.getTags();
//            if (bookTags == null) {
//                book.setTags(tags);
//                System.out.println("Tags were added!");
//            } else {
//                for (String tag : tags) {
//                    for (String bookTag : bookTags) {
//                        if (tag.equals(bookTag)) {
//                            System.err.println(tag + " is duplicate.Please input new Tags.");
//                            System.out.println("կրկնօրինակ է: Խնդրում ենք մուտքագրել նոր պիտակներ");
//                            return;
//                        }
//                    }
//                }
//                String[] newTags = new String[bookTags.length + tags.length];
//                System.arraycopy(bookTags, 0, newTags, 0, bookTags.length);
//                System.arraycopy(tags, 0, newTags, bookTags.length, tags.length);
//                book.setTags(newTags);
//                System.out.println("Tags were added!");
//                System.out.println("Ավելացվեցին պիտակներ։");
//            }
//        } catch (javadas.author.exception.BookNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    private static void initData() {
//
//        try {
//            Author author = new Author("poxos", "poxosyan", 22, "poxos@mail.com", Gender.MALE, DateUtil.stringToDate("12/05/1995"));
//            Author author1 = new Author("poxosuhi", "poxosyan", 23, "poxosuhi@mail.com", Gender.FEMALE, DateUtil.stringToDate("12/05/1997"));
//            Author author2 = new Author("petros", "petrosyan", 25, "petros@mail.com", Gender.MALE, DateUtil.stringToDate("12/05/1999"));
//            authorStorage.add(author);
//            authorStorage.add(author1);
//            authorStorage.add(author2);
//            Author[] authors = {author1, author2};
//            String[] tags = {"new", "popular", "detektiv", "lav girq"};
//            bookStorage.add(new Book("AR5555", "girq1", "desc", 33, 1, authors, tags));
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    private static void deleteBookByAuthor() {
//        printAuthorsList();
//        String email = scanner.nextLine();
//        Author author = authorStorage.getByEmail(email);
//        if (author != null) {
//            bookStorage.deleteByAuthor(author);
//        } else {
//            System.err.println("Author does not exists");
//            System.out.println("Հեղինակ գոյություն չունի");
//
//        }
//    }
//
//    private static void deleteBook() {
//        System.out.println("please choose book by serial id");
//        System.out.println("խնդրում ենք ընտրել գիրքը ըստ սերիական id-ի");
//        System.out.println("--------");
//        bookStorage.print();
//        System.out.println("--------");
//        String serialId = scanner.nextLine();
//        Book book = null;
//        try {
//            book = bookStorage.getBySerialId(serialId);
//            bookStorage.delete(book);
//        } catch (BookNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    private static void deleteAuthor() {
//        printAuthorsList();
//        String email = scanner.nextLine();
//        Author author = authorStorage.getByEmail(email);
//        if (author != null) {
//            authorStorage.delete(author);
//        } else {
//            System.err.println("Author does not exists");
//            System.out.println("Հեղինակ գոյություն չունի");
//
//        }
//    }
//
//    private static void printAuthorsList() {
//        System.out.println("please choose author's email separate ,");
//        System.out.println("խնդրում ենք ընտրել հեղինակի էլ. ,");
//        System.out.println("--------");
//        authorStorage.print();
//        System.out.println("--------");
//    }
//
//    private static void changeBookAuthor() {
//        System.out.println("please choose book by serial id");
//        System.out.println("խնդրում ենք ընտրել գիրքը ըստ սերիական id-ի");
//        System.out.println("--------");
//        bookStorage.print();
//        System.out.println("--------");
//        String serialId = scanner.nextLine();
//        Book book = null;
//        try {
//            book = bookStorage.getBySerialId(serialId);
//            printAuthorsList();
//            String emails = scanner.nextLine();
//            String[] emailArray = emails.split(",");
//            if (emailArray.length == 0) {
//                System.err.println("please choose authors");
//                System.out.println("խնդրում եմ ընտրել հեղինակներին");
//                return;
//            }
//            Author[] authors = new Author[emailArray.length];
//            int index = 0;
//            for (String email : emailArray) {
//                Author author = authorStorage.getByEmail(email);
//                if (author != null) {
//                    authors[index++] = author;
//                } else {
//                    System.err.println("please input correct author's email");
//                    System.out.println("խնդրում ենք մուտքագրել ճիշտ հեղինակի էլ");
//                    return;
//                }
//            }
//            book.setAuthors(authors);
//        } catch (BookNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
//
//    private static void changeAuthor() {
//        printAuthorsList();
//        String email = scanner.nextLine();
//        Author author = authorStorage.getByEmail(email);
//        if (author != null) {
//            System.out.println("please input author's name");
//            System.out.println("խնդրում ենք մուտքագրել հեղինակի անունը");
//            String name = scanner.nextLine();
//            System.out.println("please input author's surname");
//            System.out.println("խնդրում ենք մուտքագրել հեղինակի ազգանունը");
//            String surname = scanner.nextLine();
//            try {
//                System.out.println("please input author's gender");
//                System.out.println("խնդրում ենք մուտքագրել հեղինակի սեռը");
//                Gender gender = Gender.valueOf(scanner.nextLine());
//                System.out.println("please input author's age");
//                System.out.println("խնդրում ենք մուտքագրել հեղինակի տարիքը");
//                int age = Integer.parseInt(scanner.nextLine());
//                author.setName(name);
//                author.setSurname(surname);
//                author.setGender(gender);
//                author.setAge(age);
//            } catch (IllegalArgumentException e) {
//                System.out.println(e.getMessage());
//            }
//
//        } else {
//            System.err.println("Author does not exists");
//            System.out.println("Հեղինակ գոյություն չունի");
//        }
//    }
//
//    private static void countBooksByAuthor() {
//        printAuthorsList();
//        String email = scanner.nextLine();
//        Author author = authorStorage.getByEmail(email);
//        if (author != null) {
//            bookStorage.countByAuthor(author);
//        } else {
//            System.err.println("Author does not exists");
//            System.out.println("Հեղինակ գոյություն չունի");
//        }
//    }
//
//    private static void searchBooksByAuthor() {
//        printAuthorsList();
//        String email = scanner.nextLine();
//        Author author = authorStorage.getByEmail(email);
//        if (author != null) {
//            bookStorage.searchByAuthor(author);
//        } else {
//            System.err.println("Author does not exists");
//            System.out.println("Հեղինակ գոյություն չունի");
//        }
//    }
//
//    private static void searchBooksByTitle() {
//        System.out.println("please input keyword");
//        System.out.println("խնդրում ենք մուտքագրել հիմնաբառը");
//        String keyword = scanner.nextLine();
//        bookStorage.searchByTitle(keyword);
//    }
//
//    private static void addBook() {
//        printAuthorsList();
//        String emails = scanner.nextLine();
//        String[] emailArray = emails.split(",");
//        if (emailArray.length == 0) {
//            System.err.println("please choose authors");
//            System.out.println("խնդրում եմ ընտրել հեղինակներին");
//            return;
//        }
//        Author[] authors = new Author[emailArray.length];
//        int index = 0;
//        for (String email : emailArray) {
//            Author author = authorStorage.getByEmail(email);
//            if (author != null) {
//                authors[index++] = author;
//            } else {
//                System.err.println("please input correct author's email");
//                System.out.println("խնդրում ենք մուտքագրել ճիշտ հեղինակի էլ");
//                return;
//            }
//        }
//        System.out.println("please input book's serialId");
//        System.out.println("խնդրում ենք մուտքագրել գրքի սերիայի ID-ն");
//        String serialId = scanner.nextLine();
//        try {
//            bookStorage.getBySerialId(serialId);
//
//        } catch (BookNotFoundException e) {
//            System.out.println("please input book's title");
//            System.out.println("խնդրում ենք մուտքագրել գրքի անվանումը");
//            String title = scanner.nextLine();
//            System.out.println("please input book's description");
//            System.out.println("խնդրում ենք մուտքագրել գրքի նկարագրությունը");
//            String desc = scanner.nextLine();
//            System.out.println("please input book's price");
//            System.out.println("խնդրում եմ մուտքագրեք գրքի գինը");
//            double price = Double.parseDouble(scanner.nextLine());
//            System.out.println("please input book's count");
//            System.out.println("խնդրում ենք մուտքագրել գրքերի քանակը");
//            int count = Integer.parseInt(scanner.nextLine());
//            System.out.println("Please input book's tags separate ,");
//            System.out.println("Խնդրում ենք առանձին մուտքագրել գրքի պիտակները");
//            String tagsStr = scanner.nextLine();
//            String[] tags = tagsStr.split(",");
//
//            Book book = new Book(serialId, title, desc, price, count, authors, tags);
//
//            bookStorage.add(book);
//
//            System.out.println("Thank you, Book was added");
//            System.out.println("Շնորհակալություն, Գիրքն ավելացվեց");
//        }
//    }
//
//
//    private static void searchByAge() {
//        System.out.println("please input min age");
//        System.out.println("խնդրում ենք մուտքագրել նվազագույն տարիքը");
//        int minAge = Integer.parseInt(scanner.nextLine());
//        System.out.println("please input max age");
//        System.out.println("խնդրում ենք մուտքագրել առավելագույն տարիքը");
//        int maxAge = Integer.parseInt(scanner.nextLine());
//        authorStorage.searchByAge(minAge, maxAge);
//    }
//
//
//    private static void searchByName() {
//        System.out.println("please input keyword");
//        System.out.println("խնդրում ենք մուտքագրել հիմնաբառը");
//        String keyword = scanner.nextLine();
//        authorStorage.searchByName(keyword);
//    }
//
//    private static void addAuthor() {
//        System.out.println("please input author's name,surname,email,gender,age,dateOfBirth[12/12/2021]");
//        System.out.println("խնդրում ենք մուտքագրել հեղինակի անունը, ազգանունը, էլ. փոստը, սեռը, տարիքը, Ծննդյան ամսաթիվը[12/12/2021]");
//        String authorDataStr = scanner.nextLine();
//        String[] authorData = authorDataStr.split(",");
//        if (authorData.length == 6) {
//            int age = Integer.parseInt(authorData[4]);
//            Date date = null;
//            try {
//                date = DateUtil.stringToDate(authorData[5]);
//            } catch (ParseException e) {
//                System.out.println("invalid date format, please respect this format [12/12/2021]");
//                return;
//            }
//            Author author = new Author(authorData[0], authorData[1], age, authorData[2], Gender.valueOf(authorData[3]), date);
//
//            if (authorStorage.getByEmail(author.getEmail()) != null) {
//                System.err.println("Invalid email. Author with this email already exists");
//                System.out.println("Սխալ Էլեկտրոնային փոստի հասցե. Այս էլփոստով հեղինակն արդեն գոյություն ունի");
//            } else {
//                authorStorage.add(author);
//                System.out.println("Thank you, author was added");
//                System.out.println("Շնորհակալություն, հեղինակն ավելացվեց");
//            }
//        } else {
//            System.err.println("invalid data");
//            System.out.println("անվավեր տվյալներ");
//        }
//
//
//    }
//}
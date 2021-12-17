package education;

import education.model.Lesson;
import education.model.Student;
import education.model.User;
import education.model.UserType;
import education.storage.LessonStorage;
import education.storage.StudentStorage;
import education.storage.UserStorage;
import education.exception.UserNotFoundException;
import education.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class LessonStudentTest implements LessonStudentComands {

    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    static UserStorage userStorage = new UserStorage();


    public static void main(String[] args) {

//        userStorage.add(new User("poxos", "poxosyan", "poxos@mail.ru", "poxos", "admin"));
//        userStorage.add(new User("petros", "petrosyan", "petros@mail.ru", "petros", "user"));

        Lesson[] lesson = new Lesson[2];
        lesson[0] = lessonStorage.getByLessonName("java");
        lesson[1] = lessonStorage.getByLessonName("AutoCat");
        studentStorage.add(new Student("poxos", "poxosyan", 3, "18 / 08 / 1978", "poxos.@mail.ru", "094-94-94-23", "lesson"));

        boolean isRun = true;
        while (isRun) {
            LessonStudentComands.prinduserComands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTR:
                    register();
                    break;
                default:
                    System.out.println("Invalid command!");
                    System.out.println("Անվավեր հրաման");
            }
        }
    }

    private static void register() {
        System.out.println("please input email");
        System.out.println("Խնդրում եմ մուտքագրեք ձեր էլ");
        String email = scanner.nextLine();
        User byEmail = null;
        try {
            userStorage.getByEmail(email);
            System.out.println("User with this email already exists");
            System.out.println("Այս էլփոստով օգտվողն արդեն գոյություն ունի");
        } catch (UserNotFoundException e) {
            if (byEmail == null) {
                System.out.println("Please input name");
                System.out.println("Խնդրում ենք մուտքագրել անունը");
                String name = scanner.nextLine();

                System.out.println("Please input surname");
                System.out.println("Խնդրում ենք մուտքագրել ազգանունը");
                String surname = scanner.nextLine();

                System.out.println("Please input password");
                System.out.println("Խնդրում ենք մուտքագրել գախնաբառը");
                String password = scanner.nextLine();

                System.out.println("Please input type(ADMIN,USER)");
                System.out.println("Խնդրում ենք մուտքագրել տիպը (ADMIN,USER)");
                String type = scanner.nextLine();

                    User user = new User();
                    user.setEmail(email);
                    user.setName(name);
                    user.setSurname(surname);
                    user.setPassword(password);
                    user.setType(UserType.valueOf(type.toUpperCase()));
                    userStorage.add(user);
                    System.out.println("User was registered!");
                    System.out.println("Օգտատերը գրանցված է");
            } else {
                System.err.println("user with " + email + " already exists");
                System.err.println("օգտագործված " +  email + " արդեն գոյություն ունի");
            }
        }
    }

    private static void printRegistr() {
        userStorage.print();
    }

    private static void login() {

        System.out.println("please input email");
        System.out.println("Խնդրում եմ մուտքագրեք ձեր էլ");
        String email = scanner.nextLine();

        try {
            User user = userStorage.getByEmail(email);
            System.out.println("please input password");
            System.out.println("Խնդրում ենք մուտքագրել ձեր գաղտնաբառը");
            String password = scanner.nextLine();
            if (user.getPassword().equals(password)) {
                if (user.getType() == UserType.ADMIN) {
                    adminLogin();
                } else if (user.getType() == UserType.USER) {
                    userLogin();
                }
            } else {
                System.out.println("password is wrong!");
                System.out.println("գաղտնաբառը սխալ է");
            }
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }


    private static void adminLogin() {

        boolean isRun = true;
        while (isRun) {
            LessonStudentComands.printCommandsAdmin();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    printStudents();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentByLesson();
                    break;
                case PRINT_LESSONS:
                    printLessons();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                case PRINT_REGISTR:
                    printRegistr();
                    break;
                default:
                    System.out.println("Invalid command!");
                    System.out.println("Անվավեր հրաման");
            }
        }
    }

    private static void userLogin() {

        boolean isRun = true;
        while (isRun) {
            LessonStudentComands.printComandsUser();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    printStudents();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentByLesson();
                    break;
                case PRINT_LESSONS:
                    printLessons();
                    break;
                default:
                    System.out.println("Invalid command!");
                    System.out.println("Անվավեր հրաման");
            }
        }
    }

    private static void printLessons() {
        lessonStorage.print();
    }


    private static void printStudents() {
        studentStorage.print();
    }


    private static void addStudent() {
        System.out.println("please input name of lesson, or lessons if there is more than one ");
        System.out.println("խնդրում ենք մուտքագրել դասի անվանումը կամ դասերը, եթե կան մեկից ավելի");
        String lessonStr = scanner.nextLine();
        String[] lessonNames = lessonStr.split(",");
        int size = 0;
        for (int i = 0; i < lessonNames.length; i++) {
            if (lessonStorage.getByLessonName(lessonNames[i]) != null)
                size++;
        }
        Lesson[] lessons = new Lesson[size];
        for (int i = 0; i < size; i++) {
            if (lessonStorage.getByLessonName(lessonNames[i]) != null)
                lessons[i] = lessonStorage.getByLessonName(lessonNames[i]);
        }
        System.out.println("Please input student`s name");
        System.out.println("Խնդրում ենք մուտքագրել ուսանողի անունը");
        String name = scanner.nextLine();
        System.out.println("Please input student`s surname");
        System.out.println("Խնդրում ենք մուտքագրել ուսանողի ազգանունը");
        String surname = scanner.nextLine();
        System.out.println("Please input student`s age");
        System.out.println("Խնդրում ենք մուտքագրել ուսանողի տարիքը");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("please input student`s date of birth [12/12/2021]");
        System.out.println("խնդրում ենք մուտքագրել ուսանողի ծննդյան ամսաթիվը");
        String dateOfBirth = scanner.nextLine();
        Date date = null;
        try {
            date = DateUtil.stringToDate(dateOfBirth);
        } catch (ParseException e) {
            System.out.println("invalid date format,enter this format. [12/12/2021]");
            System.out.println("ամսաթվի անվավեր ձևաչափ,մուտքագրեք այս ֆորմատը. [12/12/2021]");
            return;
        }
        System.out.println("Please input student`s email");
        System.out.println("Խնդրում ենք մուտքագրել ուսանողի էլ");
        String email = scanner.nextLine();
        System.out.println("Please input student`s phone");
        System.out.println("Խնդրում ենք մուտքագրել ուսանողի հեռախոսը");
        String phone = scanner.nextLine();
        Student student = new Student(name, surname, age, date, email, phone, lessons);
        studentStorage.add(student);
        System.out.println("Thank You, the student was added");
        System.out.println("Շնորհակալություն, ուսանողն ավելացվեց");
    }


    private static void deleteStudentByEmail() {
        System.out.println("enter email of student");
        System.out.println("մուտքագրեք ուսանողի էլ");
        String email = scanner.nextLine();
        studentStorage.deleteByEmail(email);
    }

    private static void deleteLessonByName() {
        System.out.println("please input lesson name");
        System.out.println("խնդրում եմ մուտքագրեք դասի անվանումը");
        String lesson = scanner.nextLine();
        if (lessonStorage.getByLessonName(lesson) != null) {
            lessonStorage.deleteLesson(lesson);
            System.out.println("the lesson has been deleted");
            System.out.println("դասը ջնջված է");
        } else
            System.out.println("this type of lesson dos not exist");
        System.out.println("այս տեսակի դասերը գոյություն չունեն");
        System.out.println("այս տեսակի դասերը գոյություն չունեն");

    }

    private static void printStudentByLesson() {
        System.out.println("please input lesson");
        System.out.println("խնդրում եմ մուտքագրել դասը");
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByLessonName(lessonName);
        if (lesson != null) {
            studentStorage.printByLesson(lessonName);
        } else {
            System.err.println(" lesson with this name does not exist");
            System.out.println("այս անունով դաս գոյություն չունի");
        }
    }


    private static void addLesson() {
        System.out.println("please input lessonName");
        System.out.println("please input name of lesson, or lessons if there is more than one ");
        System.out.println("խնդրում ենք մուտքագրել դասի անվանումը կամ դասերը, եթե կան մեկից ավելի");
        String lessonStr = scanner.nextLine();
        String[] lessonNames = lessonStr.split(",");
        int size = 0;
        for (int i = 0; i < lessonNames.length; i++) {
            if (lessonStorage.getByLessonName(lessonNames[i]) != null)
                size++;
        }
        Lesson[] lessons = new Lesson[size];
        for (int i = 0; i < size; i++) {
            if (lessonStorage.getByLessonName(lessonNames[i]) != null)
                lessons[i] = lessonStorage.getByLessonName(lessonNames[i]);
        }
        System.out.println("Please input student`s name");
        System.out.println("Խնդրում ենք մուտքագրել ուսանողի անունը");
        String name = scanner.nextLine();
        System.out.println("Please input student`s surname");
        System.out.println("Խնդրում ենք մուտքագրել ուսանողի ազգանունը");
        String surname = scanner.nextLine();
        System.out.println("Please input student`s age");
        System.out.println("Խնդրում ենք մուտքագրել ուսանողի տարիքը");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("please input student`s date of birth");
        System.out.println("խնդրում ենք մուտքագրել ուսանողի ծննդյան ամսաթիվը");
        String dateOfBirth = scanner.nextLine();
        Date date = null;
        try {
            date = DateUtil.stringToDate(dateOfBirth);
        } catch (ParseException e) {
            System.out.println("invalid date format");
            System.out.println("ամսաթվի անվավեր ձևաչափ");
            return;
        }
        System.out.println("Please input student`s email");
        System.out.println("Խնդրում ենք մուտքագրել ուսանողի էլ");
        String email = scanner.nextLine();
        System.out.println("Please input student`s phone");
        System.out.println("Խնդրում ենք մուտքագրել ուսանողի հեռախոսը");
        String phone = scanner.nextLine();
        Student student = new Student(name, surname, age, date, email, phone, lessons);
        studentStorage.add(student);
        System.out.println("Thank You, the student was added");
        System.out.println("Շնորհակալություն, ուսանողն ավելացվեց");
    }
}
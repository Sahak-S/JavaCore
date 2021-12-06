package education;

import education.model.Lesson;
import education.model.Student;
import education.model.User;
import education.storage.LessonStorage;
import education.storage.StudentStorage;
import education.storage.UserStorage;
import education.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class LessonStudentTest implements LessonStudentComands {

    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    static UserStorage userStorage = new UserStorage();


    public static void main(String[] args) throws ParseException {

        userStorage.add(new User("poxos","poxosyan","poxos@mail.ru","poxos","admin"));

        Lesson[] lesson = new Lesson[2];
        lesson[0] = lessonStorage.getByLessonName("java");
        lesson[1] = lessonStorage.getByLessonName("AutoCat");
        studentStorage.add(new Student("poxos",
                "poxosyan",
                3,
                "18 / 08 / 1978",
                "poxos.@mail.ru",
                "094-94-94-23",
                "lesson"));

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
                    registr();
                    break;
                default:
                    System.out.println("Invalid command!");
                    System.out.println("Անվավեր հրաման");
            }
        }
    }
    private static void registr() {
        System.out.println("pleas input name,surname,email,password,type");
        System.out.println("խնդրում եմ մուտքագրել անուն, ազգանուն, էլ. փոստ, ծածկագիր, տեսակ");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length == 5){
            User user = new User();
            user.setName(userData[0]);
            user.setSurname(userData[1]);
            user.setEmail(userData[2]);
            user.setPassword(userData[3]);
            user.setType(userData[4]);
            userStorage.add(user);
            System.out.println("Thank you, you have successfulli registered");
            System.out.println("Շնորհակալություն, դուք հաջողությամբ գրանցվեցիք");
        }else {
            System.out.println("Wrong registration");
            System.out.println("Սխալ գրանցում");
        }


    }



    private static void login(int i) throws ParseException {
        System.out.println("pleas input email,pasword");
        System.out.println("խնդրում եմ մուտքագրել էլ. փոստ, գաղտնաբառ");
        String emailPasword = scanner.nextLine();
        String[] emailPasswordArr = emailPasword.split(",");
        if (emailPasswordArr.length == 2) {
            User user = userStorage.getUserByEmailAndPassword(emailPasswordArr[0], emailPasswordArr[1]);
            if (user == null) {
                System.out.println("invalid email or password");
                System.out.println("սխալ էլ. հասցե կամ գաղտնաբառ");
            } else {
                userLogin();
                System.out.println("e-mail Email, password added");
                System.out.println("էլ. փոստ, գաղտնաբառ ավելացվեց");// ավելացրել եմ  userLogin(); մեթոդը
            }
        } else {
            login();
            System.out.println("e-mail Email, password added");
            System.out.println("էլ. փոստ, գաղտնաբառ ավելացվեց");

        }
    }

    private static void userLogin() throws ParseException {

        boolean isRun = true;
        while (isRun) {
            LessonStudentComands.printCommands();
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

    private static void printRegistr() {
        userStorage.print();
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


    private static void printLessons() {
        lessonStorage.print();
    }

    private static void addLesson() {
        System.out.println("please input lessonName");
        System.out.println("խնդրում եմ մուտքագրեք դասի անունը");
        String lessonName = scanner.nextLine();
        System.out.println("Please input lesson duration");
        System.out.println("Խնդրում ենք մուտքագրել դասի տևողությունը");
        double duration = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input lecturer name");
        System.out.println("Խնդրում ենք մուտքագրել դասախոսի անունը");
        String lecturer = scanner.nextLine();
        System.out.println("Please input price of lesson");
        System.out.println("Խնդրում ենք մուտքագրել դասի արժեքը");
        int price = Integer.parseInt(scanner.nextLine());
        Lesson lesson = new Lesson(lessonName, duration, lecturer, price);
        lessonStorage.add(lesson);
        System.out.println("thank You , the lesson was added");
        System.out.println("շնորհակալություն, դասը ավելացվեց");
    }

    private static void printStudents() {
        studentStorage.print();
    }

    private static void addStudent() throws ParseException {
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
        Date date = DateUtil.stringToDate(dateOfBirth);
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


    private static void login() throws ParseException {
        System.out.println("pleas input email,pasword");
        System.out.println("խնդրում եմ մուտքագրել էլ. փոստ, գաղտնաբառ");
        String emailPasword = scanner.nextLine();
        String[] emailPasswordArr = emailPasword.split(",");
        if (emailPasswordArr.length == 2) {
            User user = userStorage.getUserByEmailAndPassword(emailPasswordArr[0], emailPasswordArr[1]);
            if (user == null) {
                System.out.println("invalid email or password");
                System.out.println("սխալ էլ. հասցե կամ գաղտնաբառ");
            } else {
                userLogin();
                System.out.println("e-mail Email, password added");
                System.out.println("էլ. փոստ, գաղտնաբառ ավելացվեց");
            }
        } else {
            login();
        }
    }
}

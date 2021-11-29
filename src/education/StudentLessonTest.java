package education;

import Homework.author.Author;
import Homework.author.Book;

import java.util.Scanner;

public class StudentLessonTest {

    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENT = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";


    private static void printcommands() {
        System.out.println("please input " + EXIT + " for EXIT ");
        System.out.println("please input " + ADD_LESSON + " for add lesson ");
        System.out.println("please input " + ADD_STUDENT + " for add student ");
        System.out.println("please input " + PRINT_STUDENT + " for print student ");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print student by lesson ");
        System.out.println("please input " + PRINT_LESSONS + " for print lesson ");
        System.out.println("please input " + DELETE_LESSON_BY_NAME + " for delete lesson by name ");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for delete student by email ");
    }

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printcommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENT:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("Invalid command!");
                    System.out.println("Անվավեր հրաման:");

            }

        }
    }

    private static void printStudentByLesson() {
        System.out.println("Please enter leeson");
        System.out.println("Խնդրում ենք մուտքագրել դասը");
        String lesson = scanner.nextLine();
        if (lesson != null) {
            studentStorage.printByLesson(lesson);
        } else {
            System.err.println("lesson with this name does not exist");
            System.err.println("այս անունով դաս գոյություն չունի");
        }


    }

    private static void deleteStudentByEmail() {
        System.out.println("Please input email  of student");
        System.out.println("Խնդրում ենք մուտքագրել ուսանողի էլ.");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        studentStorage.deleteStudentByEmail(email);
    }

    private static void deleteLessonByName() {
        System.out.println("Please input name  of lesson");
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        lessonStorage.deleteLessonByName(name);
    }

    private static void addLesson() {
        System.out.println("please input lesson's  name, duration,lecturerName,price");
        System.out.println("խնդրում ենք մուտքագրել դասի անվանումը, տևողությունը, դասախոսի անունը, գինը");
        String lessonDatastr = scanner.nextLine();
        String[] lessonData = lessonDatastr.split(",");
        if (lessonData.length == 4) {
            Lesson lesson = new Lesson(lessonData[0], lessonData[1], lessonData[2], lessonData[3]);
            if (lessonStorage.getByName(lesson.getName()) != null) {
                System.err.println("Invalid name. We have two different courses with the same name");
                System.out.println("Անվավեր անուն։ Մենք ունենք նույն անունով երկու տարբեր դասընթացներ");
            } else {
                lessonStorage.add(lesson);
                System.out.println("Thank you, lesson was added");
                System.out.println("Շնորհակալություն, դասը ավելացվեց");
            }
        } else {
            System.err.println("Invalid name");
            System.out.println("Անվավեր Անուն");
        }
    }

    private static void addStudent() {
        System.out.println("please input student's  name,surname,age,email,phone,lesson");
        System.out.println("խնդրում ենք մուտքագրել ուսանողի անունը, ազգանունը, տարիքը, էլ. փոստը, հեռախոսը, դասը");
        String studentDatastr = scanner.nextLine();
        String[] studentData = studentDatastr.split(",");
        if (studentData.length == 6) {
            int age = Integer.parseInt(studentData[2]);
            Student student = new Student(studentData[0], studentData[1], age, studentData[3], studentData[4], studentData[5]);

            if (studentStorage.getByEmail(student.getEmail()) != null) {
                System.err.println("Invalid email. We have two different courses with the same name");
                System.out.println("Անվավեր դաս. Մենք ունենք նույն անունով երկու տարբեր էլ");
            } else {
                studentStorage.add(student);
                System.out.println("Thank you, student was added");
                System.out.println("Շնորհակալություն, ուսանողն ավելացվեց");
            }
        } else {
            System.err.println("Invalid email");
            System.out.println("Անվավեր էլ");
        }
    }

    private static void printStudentList() {
        System.out.println("Please select a student");
        System.out.println("խնդրում ենք ընտրել ուսանողին");
        System.out.println("--------");
        studentStorage.print();
        System.out.println("--------");
    }


}
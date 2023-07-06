package grup1.error.studentManagement;

import java.util.ArrayList;
import java.util.Scanner;



public class StudentManagementSystem {


    public static void main(String[] args) {

        ArrayList<Student> arrayList = new ArrayList<>();
        while (true) {
            System.out.println("----------Բարի գալուստ ուսանողների կառավարման համակարգ----------");
            System.out.println("Խնդրում ենք մուտքագրել համարը գործողությունը կատարելու տարբերակից առաջ");
            System.out.println("1 Ավելացրեք ուսանող");
            System.out.println("2 Ջնջել ուսանողին");
            System.out.println("3 Փոխել ուսանողի տվյալները");
            System.out.println("4 Դիտեք բոլոր ուսանողներին");
            System.out.println("5 Դուրս գալ");
            System.out.println("Խնդրում ենք մուտքագրել ձեր տարբերակները");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
//                    System.out.println("Ավելացրեք ուսանող");
                    addStudent(arrayList);
                    System.out.println();
                    break;
                case "2":
//                    System.out.println("Ջնջել ուսանողին");
                    deleteStudent(arrayList, sc);
                    System.out.println();
                    break;
                case "3":
//                    System.out.println("Խմբագրել ուսանողը");
                    updateStudent(arrayList, sc);
                    System.out.println();
                    break;
                case "4":
//                    System.out.println("Դիտեք բոլոր ուսանողներին");
                    showStudent(arrayList);
                    System.out.println();
                    break;
                case "5":
                    System.out.println("Համակարգից դուրս եկ եկել, շնորհակալություն օգտագործման համար");
                    System.out.println();
                    System.exit(0);
            }
        }
    }
    Scanner scanner = new Scanner(System.in);

    public static void addStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);

        String ID;
        while (true) {
            System.out.println("Խնդրում ենք մուտքագրել ուսանողական ID");
            ID = sc.nextLine();
            boolean flag = checkStudent(arrayList, ID);
            if (flag) {
                System.out.println("Վերցված է ուսանողական վկայականը");
            } else {
                break;
            }
        }
        System.out.println("Խնդրում ենք մուտքագրել ձեր անունը");
        String name = sc.nextLine();
        System.out.println("Խնդրում ենք մուտքագրել տարիքը");
        String age = sc.nextLine();
        System.out.println("Խնդրում ենք մուտքագրել բնակության վայրը");
        String address = sc.nextLine();

        //Ստեղծեք ուսանողական օբյեկտ
        Student student = new Student();
        student.setID(ID);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        arrayList.add(student);
        System.out.println("Հաջողությամբ ավելացրեք ուսանող");
    }

    public static void showStudent(ArrayList<Student> arrayList) {
        if (arrayList.size() == 0) {
            System.out.println("Համակարգում տեղեկատվություն չկա");
            return;
        } else {
            System.out.println("ID\t\t\tԱնուն\t\tՏարիք\t\tհասցեն");
            for (int i = 0; i < arrayList.size(); i++) {
                Student student = arrayList.get(i);
                System.out.println(student.getID() + "\t\t" + student.getName() + "\t\t" + student.getAge() + "\t\t\t" + student.getAddress());
            }
        }
    }

    public static void deleteStudent(ArrayList<Student> arrayList, Scanner scanner) {
        System.out.println("Խնդրում ենք մուտքագրել ուսանողի ուսանողական ID-ն, որը պետք է ջնջվի");
        String studentid = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            if (student.getID().equals(studentid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {         //Եթե ինդեքսի արժեքը -1 է, նշանակում է, որ ուսանողի տեղեկատվությունը չի գտնվել կույտային (heap) հիշողության մեջ


            System.out.println("Ուսանողի տեղեկատվությունը գոյություն չունի");
        } else {
            arrayList.remove(index);
            System.out.println("հաջողությամբ ջնջվել է");
        }
    }

    public static void updateStudent(ArrayList<Student> arrayList, Scanner scanner) {
        System.out.println("Խնդրում ենք մուտքագրել փոփոխվող ուսանողի ուսանողական ID-ն");
        String studentid = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            if (student.getID().equals(studentid)) {
                index = i;                                      //Գործողությունն ավելի հարմար դարձնելու համար ինդեքսի արժեքը նշանակեք ինդեքսին
                break;
            }
        }
        if (index == -1) {                                 //Եթե ինդեքսի արժեքը -1 է, նշանակում է, որ ուսանողի տեղեկատվությունը չի գտնվել կույտային հիշողության մեջ

            System.out.println("Ուսանողի տեղեկատվությունը գոյություն չունի");
        } else {
            System.out.println("Խնդրում ենք մուտքագրել ուսանողի նոր անունը");
            String name = scanner.nextLine();
            System.out.println("Խնդրում ենք մուտքագրել ուսանողի նոր տարիքը");
            String age = scanner.nextLine();
            System.out.println("Խնդրում ենք մուտքագրել ուսանողի նոր հասցեն");
            String address = scanner.nextLine();

            Student s = new Student();
            s.setID(studentid);
            s.setName(name);

            s.setAddress(address);

            arrayList.set(index, s);
            System.out.println("Փոփոխեցինք ուսանողներին");
        }
    }

    public static boolean checkStudent(ArrayList<Student> arrayList, String ID) {
        boolean flag = false;
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            if (s.getID().equals(ID)) {
                flag = true;
                break;
            }
        }
        return flag;
    }


    Scanner sc = new Scanner(System.in);
}
package education.storage;

import education.model.Student;
import education.util.ArrayUtil;

import java.util.Arrays;

public class StudentStorage {


    private Student[] students = new Student[16];
    private int size = 0;



    public void add(Student student) {
        if (students.length == size) {
            extend();
        }
        students[size++] = student;
    }


    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public void deleteByEmail(String email) {
        if (email != null) {
            for (int i = 0; i < size; i++) {
                if (students[i].getEmail().equals(email)) {
                    ArrayUtil.deleteByIndex(students, i, size);
                    size--;
                    System.out.println("The student has been deleted ");
                    System.out.println("Աշակերտը ջնջվել է");
                    break;
                }
            }
        }
    }

    public Student getByLesson(String lesson) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(lesson))
                return students[i];
        }
        return null;

    }


    public Student printByLesson(String lesson) {
        if (lesson != null) {
            for (int i = 0; i < size; i++) {
                if (Arrays.toString(students[i].getLesson()).contains(lesson)) {
                    System.out.println(students[i]);
                }
            }
        }
        return null;

    }

}

package javadas.homework.education.model;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Student {

    private String name;
    private String surname;
    private int age;
    private Date dateOfBirth;
    private String email;
    private String phone;
    private Lesson[] lesson;

    public Student(String name, String surname, int age, Date dateOfBirth, String email, String phone, Lesson[] lesson) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phone = phone;
        this.lesson = lesson;
    }

    public Student(String poxos, String poxosyan, int age, String s, String email, String phone, String lesson) {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Lesson[] getLesson() {
        return lesson;
    }

    public void setLesson(Lesson[] lesson) {
        this.lesson = lesson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(dateOfBirth, student.dateOfBirth) && Objects.equals(email, student.email) && Objects.equals(phone, student.phone) && Arrays.equals(lesson, student.lesson);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, age, dateOfBirth, email, phone);
        result = 31 * result + Arrays.hashCode(lesson);
        return result;
    }

    @Override

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", lesson=" + Arrays.toString(lesson) +
                '}';
    }
}

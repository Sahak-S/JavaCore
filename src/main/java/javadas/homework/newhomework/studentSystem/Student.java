package javadas.homework.newhomework.studentSystem;

import java.util.Objects;
/**
 * @student xxxxx
 * @author fekiee
 * @email xxxxxxxx@xxxxx.com**/


public class Student {
    // սահմանել օբյեկտի հատկանիշները
    private int    studentNumber;
    private String lastName;
    private String firstName;
    private String email;
    private int  phoneNumber;

    public Student(int studentNumber, String lastName, String firstName, String email, int phoneNumber) {
        this.studentNumber = studentNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Student() {
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentNumber == student.studentNumber && phoneNumber == student.phoneNumber && Objects.equals(lastName, student.lastName) && Objects.equals(firstName, student.firstName) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentNumber, lastName, firstName, email, phoneNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}

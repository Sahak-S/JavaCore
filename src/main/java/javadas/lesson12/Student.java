package javadas.lesson12;

import java.util.Objects;

public class Student {

    private String name;
    private String surnname;
    private String phoneNumber;
    private int age;
    private String lessonName;
    private String phonNumber;
    private String iD;


    public Student(String name, String surnname, String phoneNumber, int age, String lessonName, String iD) {
        this.name = name;
        this.surnname = surnname;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.lessonName = lessonName;
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnname() {
        return surnname;
    }

    public void setSurnname(String surnname) {
        this.surnname = surnname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getPhonNumber() {
        return phonNumber;
    }

    public int setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
        return 0;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && phonNumber == student.phonNumber && Objects.equals(name, student.name) && Objects.equals(surnname, student.surnname) && Objects.equals(phoneNumber, student.phoneNumber) && Objects.equals(lessonName, student.lessonName) && Objects.equals(iD, student.iD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surnname, phoneNumber, age, lessonName, phonNumber, iD);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surnname='" + surnname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", lessonName='" + lessonName + '\'' +
                ", phonNumber=" + phonNumber +
                ", iD='" + iD + '\'' +
                '}';
    }
}

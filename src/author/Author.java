package author;

import java.nio.charset.Charset;
import java.util.Objects;

public class Author {

    private String name;
    private String surnname;
    private int age;
    private String email;
    private String gender;

    public Author(String name, String surnname, int age, String email, String gender) {
        this.name = name;
        this.surnname = surnname;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public Author(String william, String shakespeare, String s, int i, String male) {
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
    public void setSurname(String surname) {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return age == author.age && Objects.equals(name, author.name) && Objects.equals(surnname, author.surnname) && Objects.equals(email, author.email) && Objects.equals(gender, author.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surnname, age, email, gender);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surnname='" + surnname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


}
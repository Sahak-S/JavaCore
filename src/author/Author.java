package author;

import java.nio.charset.Charset;

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

    public Author() {
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
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surnname='" + surnname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void setAuthor(String name, String surname, String gender, int age){

    }

    public void setSurname(String name) {
    }
}

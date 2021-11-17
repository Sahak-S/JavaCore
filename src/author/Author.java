package author;

public class Author {



    private String name;                // անուն
    private String surnname;            // ազգանուն
    private String email;               // էլհասցե
    private int age;                    // տրիք
    private String gender;              // սեռ


    public Author(String name, String surnname, String email, int age, String gender) {
        this.name = name;
        this.surnname = surnname;
        this.email = email;
        this.age = age;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

package education;

import java.util.Objects;

public class Lesson {

    private String name;
    private String  duration;       // դասընթացի տևողությունն է
    private String lecturerName;    //դասախոսի անունն է
    private String price;           //դասընթացի գինն է

    public Lesson(String name, String duration, String lecturerName, String price) {
        this.name = name;
        this.duration = duration;
        this.lecturerName = lecturerName;
        this.price = price;
    }

    public Lesson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return Objects.equals(name, lesson.name) && Objects.equals(duration, lesson.duration) && Objects.equals(lecturerName, lesson.lecturerName) && Objects.equals(price, lesson.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration, lecturerName, price);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", lecturerName='" + lecturerName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

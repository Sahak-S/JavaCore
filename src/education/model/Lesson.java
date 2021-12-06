package education.model;

import java.util.Objects;

public class Lesson {


    private String lessonName;
    private double duration;       // դասընթացի տևողությունն է
    private String lecturerName;    //դասախոսի անունն է
    private int price;           //դասընթացի գինն է

    public Lesson(String lessonName, double duration, String lecturerName, int price) {
        this.lessonName = lessonName;
        this.duration = duration;
        this.lecturerName = lecturerName;
        this.price = price;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return Objects.equals(lessonName, lesson.lessonName) && Objects.equals(duration, lesson.duration) && Objects.equals(lecturerName, lesson.lecturerName) && Objects.equals(price, lesson.price);
    }


    @Override
    public int hashCode() {
        return Objects.hash(lessonName, duration, lecturerName, price);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                ", duration='" + duration + '\'' +
                ", lecturerName='" + lecturerName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

}
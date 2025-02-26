package javadas.newHomework.education.model;

import java.io.Serializable;
import java.util.Objects;

public class Lesson implements Serializable {

    private String lessonName;      // դասի անունը
    private double duration;        // դասընթացի տևողությունն է
    private String lecturerName;    //դասախոսի անունն է
    private int price;             //դասընթացի գինն է

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

        if (Double.compare(lesson.duration, duration) != 0) return false;
        if (price != lesson.price) return false;
        if (lessonName != null ? !lessonName.equals(lesson.lessonName) : lesson.lessonName != null) return false;
        return lecturerName != null ? lecturerName.equals(lesson.lecturerName) : lesson.lecturerName == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lessonName, duration, lecturerName, price);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                ", duration=" + duration +
                ", lecturerName='" + lecturerName + '\'' +
                ", price=" + price +
                '}';
    }
}

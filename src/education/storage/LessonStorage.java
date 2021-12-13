package education.storage;

import education.model.Lesson;
import education.util.ArrayUtil;

public class LessonStorage {


    private Lesson[] lessons = new Lesson[16];
    private int size = 0;

    public void add(Lesson lesson) {
        if (lessons.length == size) {
            extend();
        }
        lessons[size++] = lesson;
    }


    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }
    public void deleteLesson(String lesson) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getLessonName().equals(lesson)) {
                ArrayUtil.deleteByIndex(lessons, i, size);
                size--;
                System.out.println("The lesson has been deleted");
                System.out.println("Դասը ջնջված է");
                break;
            }
        }
    }

    public Lesson getByLessonName(String lessonName) {

        for (int i = 0; i < size; i++) {
            if (lessons[i].getLessonName().equals(lessonName))
                return lessons[i];
        }
        return null;
    }


}
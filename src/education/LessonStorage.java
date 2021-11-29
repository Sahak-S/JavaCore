package education;

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

    public Lesson getByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                return lessons[i];
            }
        }
        return null;
    }


    public void deleteLessonByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                deleteByIndex(i);
                System.out.println("The lesson has been deleted");
                System.out.println("Դասը ջնջված է");
            }
        }
    }

    private void deleteByIndex(int index) {
        for (int j = index + 1; j < size; j++) {
            lessons[j - 1] = lessons[j];
        }
        size--;
    }

}
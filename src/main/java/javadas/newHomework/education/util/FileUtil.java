package javadas.newHomework.education.util;

import javadas.newHomework.education.model.Student;
import javadas.newHomework.education.model.User;
import javadas.newHomework.education.model.Lesson;

import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;

public class FileUtil {

    static private String DATA_PATH = "C:\\Users\\User\\IdeaProjects\\JavaCore\\src\\main\\java\\newHomework\\education\\data";

    public static void serializeUser(Map<String, User> userMap) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH= "\\user.dat"))){
            out.writeObject(userMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void serializeStudent(List<Student> students) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "\\student.dat"))) {
            out.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void serializeLesson(List<Lesson> lessons) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "lesson.dat"))) {
            out.writeObject(lessons);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Map<String, User> deserializeUser() {
        File userFile = new File(DATA_PATH + "\\user.dat");
        if (!userFile.exists()){
            try {
                userFile.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try(ObjectInputStream in = new ObjectInputStream(Files.newInputStream(userFile.toPath()))) {
                in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }






    public static List<Student> deserializeStudent() {
        File studentFile = new File(DATA_PATH + "\\student.dat");
        if (!studentFile.exists()){
            try {
                studentFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(studentFile))) {
                in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public static List<Lesson> deserializeLesson() {
        File lessonFile = new File(DATA_PATH + "\\lesson.dat");
        if (!lessonFile.exists()) {
            try {
                lessonFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(lessonFile))) {
                in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;

    }

}

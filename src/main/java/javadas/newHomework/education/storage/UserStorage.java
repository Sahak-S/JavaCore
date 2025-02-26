package javadas.newHomework.education.storage;

import javadas.newHomework.education.model.User;
import javadas.newHomework.education.util.FileUtil;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {

    private Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getUserEmail(), user);
        FileUtil.serializeUser(users);
    }

    public User getByEmail(String email) {
        return users.get(email);
    }


    public void initData() {
        this.users = FileUtil.deserializeUser();
    }
}

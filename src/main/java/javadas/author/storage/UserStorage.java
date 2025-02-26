package javadas.author.storage;


import javadas.author.model.User;
import javadas.author.util.FileUtil;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {
    private Map<String, User> userMap = new HashMap<>();

    public void add(User user) {
        userMap.put(user.getEmail(), user);
        FileUtil.serializeUserMap(userMap);
    }

    public User getByEmail(String email) {
        return userMap.get(email);
    }

    public void print() {
        for (User value : userMap.values()) {
            System.out.println(value);
        }
    }

    public void initData() {
        Map<String, User> userMapFromFile = FileUtil.deserializeUserMap();
        if (userMapFromFile != null) {
            userMap = userMapFromFile;
        }
    }
    //TODO add implementation later.
    public User getByEmailAndPassword(String email, String password) {
        return null;
    }
}
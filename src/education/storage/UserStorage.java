package education.storage;


import education.model.User;
import education.exception.UserNotFoundException;
import education.model.UserType;

public class UserStorage {

    private User[] users = new User[16];
    private int size = 0;

    public void add(User user) {
        if (users.length == size) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

//    public User getUserByEmailAndPassword(String email, String password) {
//        for (int i = 0; i < size; i++)
//            if (users[i].getEmail().equals(email) &&
//                    users[i].getPassword().equals(password)) {
//                return users[i];
//            } else {
//
//            }
//        return null;
//    }


    public User getByEmail(String email) throws UserNotFoundException {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        throw new UserNotFoundException("There is no user: email" + email + " ");

    }
}



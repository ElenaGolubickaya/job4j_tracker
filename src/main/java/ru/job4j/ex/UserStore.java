package ru.job4j.ex;

import org.w3c.dom.ls.LSOutput;

public class UserStore {
    public static User findUser(User[] user, String login) throws UserNotFoundException {
        for (User user1 : user) {
            if (user1.getUsername().equals(login)) {
                return user1;
            }
        }
        throw new UserNotFoundException("User Not Found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() > 3 || user.isValid()) {
            return true;
        }
        throw new UserInvalidException("User Invalid");
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("Пользователь не валидный");
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            System.out.println("Пользователь не найден");
            e.printStackTrace();
        }
    }
}


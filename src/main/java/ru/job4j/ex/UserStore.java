package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                return users[index];
            }
        }
        throw new UserNotFoundException("Элемент не найден");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() > 3) {
            return true;
        }
        throw  new UserInvalidException("Не валидный пользователь");
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
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}

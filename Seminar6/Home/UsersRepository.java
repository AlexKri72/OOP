package Seminar6.Home;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {

    private static List<User> users = new ArrayList<>();

    public static void addUserList(User user) {
        users.add(user);
        System.out.println("Пользователь " + user.getName() + " добавлен.");
    }

    public static void removeUser(String user) {
        System.out.println("Пользователь " + user + " удален.");
        try {

            for (User item : users) {
                if (item.getName().equals(user)) {
                    users.remove(item);
                }
            }
        } catch (Exception e) {

        }

    }

    // возвращает Юзера по имени
    public static User getUser(String name) {
        User temp = new User("Noname", Role.USER);
        for (User item : users) {
            if (item.getName().equals(name)) {
                temp = item;
            }
        }

        return temp;

    }

    public static void printUserList() {
        for (User item : users) {
            System.out.println(item.getName());
        }
    }

}

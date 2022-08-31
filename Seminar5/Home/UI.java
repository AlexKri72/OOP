package Seminar5.Home;

import java.sql.Date;
import java.util.Scanner;

public class UI {
    public static void run() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свой Никнейм:");
        String nick = sc.nextLine();

        while (true) {

            System.out.println(
                    "Выберите что будем делать:\n1 - Добавить пользователя\n2 - Удалить пользователя\n3 - Обновить лист сообщений\n4 - Написать сообщение\n5 - Редактировать сообщение\n6 - Поиск по сообщениям\n7 - Выход");
            String choice = sc.nextLine();
            switch (choice) {
                case ("1") -> {
                    if (UsersRepository.getUser(nick).role.equals(Role.ADMINISTRATOR)) {

                        System.out.println("Введите НикНейм нового пользователя:");
                        String name = sc.nextLine();
                        System.out.println(
                                "Введите тип нового пользователя\n1 - Обычный пользователь\n2 - Администратор\n3 - Модератор\n4 - Комментатор\n5 - Редактор");
                        String userType = sc.nextLine();

                        switch (userType) {
                            case ("1") -> {
                                UsersRepository.addUserList(new User(name, Role.USER));
                                break;
                            }
                            case ("2") -> {
                                UsersRepository.addUserList(new User(name, Role.ADMINISTRATOR));
                                break;
                            }
                            case ("3") -> {
                                UsersRepository.addUserList(new User(name, Role.MODERATOR));
                                break;
                            }
                            case ("4") -> {
                                UsersRepository.addUserList(new User(name, Role.COMMENTATOR));
                                break;
                            }
                            case ("5") -> {
                                UsersRepository.addUserList(new User(name, Role.EDITOR));
                                break;
                            }
                            default -> System.out.println("Ошибка ввода!");

                        }

                    } else {
                        System.out.println("Вы не администратор, не хватает прав!");
                    }
                }
                case ("2") -> {

                    if (UsersRepository.getUser(nick).getRole().equals(Role.ADMINISTRATOR)) {
                        System.out.println("Введите НикНейм пользователя, которого хотите удалить: ");
                        String nickName = sc.nextLine();
                        UsersRepository.removeUser(nickName);
                    } else {
                        System.out.println("Вы не администратор, не хватает прав!");
                    }

                }

                case ("3") -> MessageRepository.updateMsgList();

                case ("4") -> {
                    String inputMessage = sc.nextLine();
                    Date date = new Date(System.currentTimeMillis());
                    MessageRepository.addMessage(new MessageToUser(MessageRepository.number, date,
                            UsersRepository.getUser(nick), inputMessage));
                }
                case ("5") -> {
                    MessageRepository.updateMsgList();
                    System.out.println("Введите номер сообщения, которое будем редактировать: ");
                    Integer messageID = sc.nextInt();
                    System.out.println("Введите новый текст: ");
                    String messageText = sc.nextLine();
                    Date date = new Date(System.currentTimeMillis());
                    MessageRepository.editMessage(messageID, new MessageToUser(MessageRepository.number, date,
                            UsersRepository.getUser(nick), messageText));
                }
                case ("6") -> {
                    String search = sc.nextLine();
                    for (MessageToUser item : MessageRepository.getMessageList()) {
                        if (item.textMessage.contains(search)) {
                            System.out.println(item.date + " " + item.user + " " + item.textMessage);
                        }
                    }
                }
                case ("7") -> {
                    System.out.println("До свидания!");
                    break;
                }
            }
        }
    }
}

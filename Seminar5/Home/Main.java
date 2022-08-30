package Seminar5.Home;

/*
Разработать "мессенджер". Нужен следующий функционал:
- различные виды пользователей: обычный user, админ, модератор и тд. Наделить пользователей различными ролями
- различные хранилища: сообщения, пользователи и тд
- продумать модель сообщений: дата отправки, возможность редактирования, возможность удаления, дата обновления сообщения

Дополнительно:
- поиск по сообщениям
- проявить фантазию и добавить свой функционал)
*/

public class Main {
    public static void main(String[] args) {

        UsersRepository.addUserList(new User("AlexKri", Role.MODERATOR));
        UsersRepository.addUserList(new User("AnastasiaVenskaya", Role.COMMENTATOR));
        UsersRepository.addUserList(new User("OlegGlumov", Role.EDITOR));
        UsersRepository.addUserList(new User("DaniilKobzar", Role.USER));

        UI.run();

    }
}

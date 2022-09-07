package Seminar6.Home;

import java.util.ArrayList;
import java.util.List;

public class MessageRepository {
    public static Integer number = 1;
    private static List<MessageToUser> message = new ArrayList<>();

    public static void updateMsgList() {
        for (MessageToUser item : message) {
            System.out.println(item.getID() + " " + item.date + " " + item.user + " " + item.textMessage);
        }
    }

    public static void addMessage(MessageToUser msg) {
        message.add(msg);
        number++;
    }

    public static List<MessageToUser> getMessageList() {
        return message;
    }

    public static void editMessage(Integer index, MessageToUser element) {
        for (MessageToUser item : message) {
            if (item.getID().equals(index)) {
                message.set(message.indexOf(item), element);
            }
        }
        message.set(index, element);
    }

    public static BaseUser getUser(Integer number) {
        User user = null;
        for (MessageToUser item : message) {
            if (item.getID().equals(number)) {
                user = (User) item.user;
            }

        }
        return user;

    }
}

package Seminar5.Home;

import java.util.ArrayList;
import java.util.List;

public class MessageRepository {

    private static List<MessageToUser> message = new ArrayList<>();

    public static void updateMsgList() {
        for (MessageToUser item : message) {
            System.out.println(item.date + " " + item.user + " " + item.textMessage);
        }
    }

    public static void addMessage(MessageToUser msg) {
        message.add(msg);
    }

    public static List<MessageToUser> getMessageList() {
        return message;
    }
}

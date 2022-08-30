package Seminar5.Home;

import java.sql.Date;

public abstract class BaseMessage {
    Date date;
    BaseUser user;
    String textMessage;

    public BaseMessage(Date date, BaseUser user, String textMessage) {
        this.date = date;
        this.user = user;
        this.textMessage = textMessage;
    }

}

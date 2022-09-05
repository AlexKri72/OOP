package Seminar5.Home;

import java.sql.Date;

public class MessageToUser extends BaseMessage {

    private Integer ID;

    public MessageToUser(Integer ID, Date date, BaseUser user, String textMessage) {
        super(date, user, textMessage);
        this.ID = ID;

    }

    public Integer getID() {
        return ID;
    }

}

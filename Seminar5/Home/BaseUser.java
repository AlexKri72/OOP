package Seminar5.Home;

public abstract class BaseUser {
    protected static String nickName;

    public BaseUser(String nickName) {
        BaseUser.nickName = nickName;
    }

    public static String getNickName(String myNickName) {
        return nickName;
    }

    public static void add(String temp) {
        BaseUser.add(temp);
    }

}

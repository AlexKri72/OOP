package Seminar6.Home;

public class User extends BaseUser {
    protected Role role;

    public User(String nickName, Role role) {
        super(nickName);
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public String getName() {
        return nickName;
    }

}

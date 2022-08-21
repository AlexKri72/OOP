
public abstract class Pet {

    private final String nickName;
    private final Integer age;

    public Pet(String nickName, Integer age) {
        this.nickName = nickName;
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return ("Nickname: " + this.nickName + "; age:" + this.age);
    }

    public abstract void Respond();

}

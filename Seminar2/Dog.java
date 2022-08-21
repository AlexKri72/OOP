public class Dog extends Pet {

    String color;
    public Dog(String nickName, Integer age, String color) {

        super(nickName, age);
        this.color=color;
    }

    @Override
    public void Respond() {
        System.out.println("Gav-Gav!");
    }

}

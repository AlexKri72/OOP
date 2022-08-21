public class Cat extends Pet {

    public Cat(String nickName, Integer age) {
        super(nickName, age);
    }

    @Override
    public void Respond() {
        System.out.println("Meow-Meow!");

    }
}

// Описать логику взаимодействия человека и домашнего питомца. Добавить разных животных.
// Добавить разные методы взаимодействия питомца и человека.
// Возможно добавить разных членов семьи?
// Нужно использовать абстрактные классы и интерфейсы.
//
// Сценарий: Человек “зовёт” котика “кис-кис”, котик отзывается.

public class Main {
    public static void main(String[] args) {

        TreeOfPerson mansTree = new TreeOfPerson();

        mansTree.addPerson(new DogLover("Dmitriy", "Vasiliev", 1943));
        mansTree.addPerson(new DogLover("Olga", "Vasilieva", 1967));

        mansTree.addPerson(new CatLover("Oleg", "Vasiliev", 1965));
        mansTree.addPerson(new CatLover("Maria", "Vasilieva", 1953));

        System.out.println("List of persons:\n" + mansTree + "\n");

        TreeOfPet pets = new TreeOfPet();

        pets.add(new Dog("Krot", 2, "White"));
        pets.add(new Dog("Slon", 10, "Black"));

        pets.add(new Cat("Vaska", 8));
        pets.add(new Cat("Fibi", 5));

        System.out.println("List of pets:\n" + pets + "\n");

        Research1.getAllCall(mansTree, pets);
        Research1.getPet(pets, "Cat");
        Research1.getPet(pets, "Dog");
        Research1.getPetLovers(mansTree, "Cat");
        Research1.getPetLovers(mansTree, "Dog");

    }

}
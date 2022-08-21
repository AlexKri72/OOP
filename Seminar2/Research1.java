
import java.util.List;

public class Research1 {

    public static void getPetLovers(TreeOfPerson persons, String pet) {
        List<Person> tree = persons.getTree();
        System.out.println("List of " + pet + " Lovers:");

        for (Person person : tree) {
            if (pet.equals("Dog") && person instanceof DogLover) {
                System.out.println(person);
            }
            if (pet.equals("Cat") && person instanceof CatLover) {
                System.out.println(person);
            }
        }
        System.out.println();
    }

    public static void getPet(TreeOfPet pets, String pet) {
        List<Pet> tree = pets.getTree();
        System.out.println("List of " + pet + " :");
        for (Pet item : tree) {
            if (pet.equals("Cat") && item instanceof Cat) {
                System.out.println(pet);
            }
            if (pet.equals("Dog") && item instanceof Dog) {
                System.out.println(pet);
            }
        }
        System.out.println();
    }

    public static void getAllCall(TreeOfPerson persons, TreeOfPet pets) {
        List<Person> peoples = persons.getTree();
        List<Pet> animals = pets.getTree();
        for (Person person : peoples) {
            for (Pet pet : animals) {
                if (person instanceof DogLover) {
                    ((DogLover) person).callPet(pet);
                } else if (person instanceof CatLover) {
                    ((CatLover) person).callPet(pet);
                }
                System.out.println();
            }
        }
    }

}
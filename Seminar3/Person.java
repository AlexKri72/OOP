import java.util.Iterator;

public class Person implements Comparable<Person>, Iterable<Person> {
    private String name;
    private String surname;
    private int yearOfBirthday;

    public Person(String name, String surname, Integer yearOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirthday = yearOfBirthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getYearOfBirthday() {
        return yearOfBirthday;
    }

    @Override
    public int compareTo(Person o) {
        return this.yearOfBirthday - o.yearOfBirthday;
    }

    @Override
    public Iterator<Person> iterator() {
        // TODO Auto-generated method stub
        return null;
    }
}
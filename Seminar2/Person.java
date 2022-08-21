
public class Person extends Man {
    private final String name;
    private final String surname;

    public Person(String name, String surname, Integer yearOfBirthday) {
        super(yearOfBirthday);
        this.name = name;
        this.surname = surname;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year of birthday='" + yearOfBirthday + '\'' +
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
}

import java.util.ArrayList;
import java.util.List;

public class TreeOfPerson {
    private List<Person> tree = new ArrayList<>();

    public List<Person> getTree() {
        return tree;
    }

    public void addPerson(Person p) {
        tree.add(p);
    }

    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder();
        for (Person i : tree) {
            resultString.append(i.toString() + "\n");
        }

        return resultString.toString();
    }

}
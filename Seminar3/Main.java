/*Реализовать, с учетом ООП подхода, приложение для проведения исследований с генеалогическим древом.
Идея- описать некоторое количество компонент, например:
1. модель человека
2. компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д.
3. компонент для проведения исследований
4. дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных моделей человека
Под “проведением исследования” можно понимать получение всех детей выбранного человека.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        List<Person> family = new ArrayList<Person>();

        family.add(new Person("Dmitriy", "Vasiliev", 1975));
        family.add(new Person("Oleg", "Vasiliev", 1999));
        family.add(new Person("Olga", "Vasilieva", 1997));
        family.add(new Person("Maria", "Vasilieva", 1977));

        Collections.sort(family);

        Iterator<Person> iter = family.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        printFamily(family);

        Tree tree = new Tree();
        tree.addLink(family.get(0), family.get(1), Relation.PARENT, Relation.CHILD);
        tree.addLink(family.get(0), family.get(2), Relation.PARENT, Relation.CHILD);
        tree.addLink(family.get(3), family.get(1), Relation.PARENT, Relation.CHILD);
        tree.addLink(family.get(3), family.get(2), Relation.PARENT, Relation.CHILD);
        tree.addLink(family.get(3), family.get(0), Relation.WIFE, Relation.WIFE);
        tree.addLink(family.get(1), family.get(2), Relation.BROTHER, Relation.SYSTER);

        UI.Call(tree);

    }

    private static void printFamily(List<Person> family) {
        System.out.println("\n\nWe have the following family:");
        for (Person item : family) {
            System.out.println(item.getName() + " " + item.getSurname() + ", " + item.getYearOfBirthday());
        }
    }
}
import java.util.List;

public class Research {
    public static void printChildren(String name, Tree tree) {

        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.PARENT) {
                System.out.println(name + " are parent " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printParents(String name, Tree tree) {

        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.CHILD) {
                System.out.println(name + " are parent " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printWife(String name, Tree tree) {

        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.WIFE) {
                System.out.println(
                        name + " are wife " + el.getPersonSecond().getName() + " " + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printSyster(String name, Tree tree) {

        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.SYSTER) {
                System.out.println(name + " are syster " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }

    public static void printBrother(String name, Tree tree) {

        List<Link> links = tree.getLinks();

        for (Link el : links) {
            if (el.getPersonFirst().getName().equals(name) &&
                    el.getLink() == Relation.BROTHER) {
                System.out.println(name + " are brother " + el.getPersonSecond().getName() + " "
                        + el.getPersonSecond().getSurname());
            }
        }
    }
}
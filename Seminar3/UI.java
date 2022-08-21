import java.util.Scanner;

public class UI {
    public static void Call(Tree tree) {

        System.out.print("Enter the name of the family member whose family ties we will investigate:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();

        Research.printWife(name, tree);
        Research.printChildren(name, tree);
        Research.printSyster(name, tree);
        Research.printBrother(name, tree);
        Research.printParents(name, tree);
    }

}
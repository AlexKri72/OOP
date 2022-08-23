package Home;

import java.io.File;
import java.util.Scanner;

public class ExportService {
    public String path = "C:/Users/1/Desktop/OOP/Seminar4/Home/TaskList";
    Scanner sc = new Scanner(System.in);

    public void getChoice() {

        while (true) {
            System.out.println("Export to: 1-XML, 2-CSV, 3-JSON");
            switch (sc.next()) {
                case ("1") -> {
                    exportToXML();
                    break;
                }
                case ("2") -> {
                    exportToCSV();
                    break;
                }
                case ("3") -> {
                    exportToJSON();
                    break;
                }
                default -> System.out.println("Noup! That`s not correct! Try again");
            }
        }
    }

    public void exportToXML() {
        path += ".xml";
        ExportToXML exp = new ExportToXML(new File(path));
    }

    public void exportToCSV() {
        path += ".csv";
        ExportToCSV exp = new ExportToCSV(new File(path));
    }

    public void exportToJSON() {
        path += ".json";
        ExportToJSON exp = new ExportToJSON(new File(path));
    }
}
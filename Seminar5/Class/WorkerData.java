package Seminar5.Class;

public class WorkerData {
    private static Long id = 0l;
    Worker worker;

    public WorkerData(Worker worker) {
        this.worker = worker;
        id++;
    }

    public static Long getId() {
        return id;
    }
}
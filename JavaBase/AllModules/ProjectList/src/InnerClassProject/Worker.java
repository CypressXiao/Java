package InnerClassProject;

public class Worker {
    String name;
    int ID;
    double deposit;
    double salary;

    public Worker() {
    }

    public Worker(String name, int ID, double deposit, double salary) {
        this.name = name;
        this.ID = ID;
        this.deposit = deposit;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", deposit=" + deposit +
                ", salary=" + salary +
                '}';
    }
}

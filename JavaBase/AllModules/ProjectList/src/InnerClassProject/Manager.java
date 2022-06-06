package InnerClassProject;

public class Manager extends Worker {
    double bonus;

    public Manager(String name, int ID, double deposit, double salary, double bonus) {
        super(name, ID, deposit, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

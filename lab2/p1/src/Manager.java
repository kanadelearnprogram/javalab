public class Manager extends Employee{
    private int bonus;
    public Manager(String name, int ID, int salary, int bonus) {
        super(name, ID, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
}

public class Scientist extends Person{
    public int ID;
    public Scientist(int salary) {
        super(salary);
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    @Override
    public int allSalary() {
        return super.allSalary();
    }
    public String toString() {
        return "Scientist" +allSalary()+"ID: "+ID;
    }
    /*public int allSalary() {
        return this.salary;
    }*/


    /*public Scientist(int salary) {
        this.salary=salary;
    }*/

}

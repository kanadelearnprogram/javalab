public class Teacher extends Person{
    public Teacher(int salary) {
        super(salary);
    }

    @Override
    public int allSalary() {
        return super.allSalary();
    }
   /* @Override
    public int allSalary() {
       return this.salary;
    }*/

    /*public Teacher(int salary) {
        this.salary=salary;
    }*/
    public String toString() {
        return "Teacher" +getSalary();
    }
}

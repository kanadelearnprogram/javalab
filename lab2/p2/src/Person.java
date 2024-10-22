public class Person {
private int salary;  //Person类中的salary字段应该是私有的，以符合封装的原则。直接暴露字段会导致数据的不安全性，并且无法控制对字段的操作

    public Person(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int allSalary(){
    return this.salary;
}


}

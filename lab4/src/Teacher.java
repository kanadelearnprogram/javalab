public class Teacher extends People{
    int salary;

    public Teacher(String tname, int tid, int salary) {
        super(tname, tid);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  tname+ " "+tid+" "
                + salary;
    }
    @Override
    public int compareTo(People other) {
        if (other instanceof Teacher) {
            Teacher otherTeacher = (Teacher) other;
            return Double.compare(this.salary, otherTeacher.salary);
        } else {
            return super.compareTo(other); // 回退到People的比较方式
        }
    }
}

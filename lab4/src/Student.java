public class Student extends People{
    int scholarship;

    public Student(String tname, int tid, int scholarship) {
        super(tname, tid);
        this.scholarship = scholarship;
    }
    @Override
    public int compareTo(People other) {
        if (other instanceof Student) {
            Student otherStudent = (Student) other;
            return Double.compare(this.scholarship, otherStudent.scholarship);
        } else {
            return super.compareTo(other); // 回退到People的比较方式
        }
    }
    @Override
    public String toString() {
        return  tname+ " "+tid+" "
                + scholarship;
    }
}

public class People implements Comparable<People>{
    String tname;
    int tid;

    public People(String tname, int tid) {
        this.tname = tname;
        this.tid = tid;
    }

    @Override
    public int compareTo(People o) {
        return Integer.compare(this.tid,o.tid);
    }
}

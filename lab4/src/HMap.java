import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HMap {
    static HashMap<Student,Teacher> STMap = new HashMap<>();
    public static void main(String[] args) {
    STMap.put(new Student("kanade",1,1000),new Teacher("kumiko",1,2000));
    STMap.put(new Student("yui",2,1000),new Teacher("kumiko",1,2000));
    STMap.put(new Student("kanade1",13,1000),new Teacher("kumiko",1,2000));
    STMap.put(new Student("kanade2",14,1000),new Teacher("mayuli",2,3000));
    STMap.put(new Student("kanade3",15,1000),new Teacher("mayuli",2,5000));

    for (Student i:STMap.keySet()){
        System.out.println(i+" "+STMap.get(i));
    }
    Iterator<Student> iterator = STMap.keySet().iterator();

        // 使用迭代器遍历并输出每个键
        while (iterator.hasNext()) {
            Student key = iterator.next();
            System.out.println(key);
        }

        for (Map.Entry<Student, Teacher> entry : STMap.entrySet()) {
            Student key = entry.getKey();
            Teacher value = entry.getValue();
            System.out.print("name:"+key.tname+"sch:"+key.scholarship);
            System.out.println("Name: " + value.tname + ", Salary: " + value.salary);
        }

        int sum=0;
        for (Student i:STMap.keySet()){
            sum+= i.scholarship;
            sum+= STMap.get(i).salary;
        }
        System.out.println(sum);

        int count = 0;
        for (Map.Entry<Student, Teacher> entry : STMap.entrySet()) {
            Student key = entry.getKey();
            Teacher value = entry.getValue();
            if (value.salary>=3000&&value.salary<=5000){
                count++;
                System.out.println(value);
            }
        }
        System.out.println(count);
    }
}

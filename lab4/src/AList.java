import java.util.ArrayList;
import java.util.List;

public class AList {
    static ArrayList<Teacher> teacherArrayList = new ArrayList<>();

    public static int countSalary(ArrayList<Teacher> ALT){
        int sum = 0;
        for (Teacher teacher : ALT ) {
            sum+=teacher.salary;
        }
        return sum;
    }
    public static void printTeacher(ArrayList<Teacher> t){
        for (int i = 0; i < t.size(); i++) {
            System.out.println("index:"+i+" "+"element:"+teacherArrayList.get(i));
        }

    }
    public static ArrayList findSalary(ArrayList<Teacher> t){
        ArrayList temp = new ArrayList<>();
        for (Teacher teacher :t) {
            if (teacher.salary >  3000){
                temp.add(teacher);

            }
        }
        return temp;
    }
    public static void rmthird(ArrayList teacherArrayList){
        System.out.println(teacherArrayList.size());
        if (teacherArrayList.size()<3){
            System.out.println("error");
        }
        System.out.println(teacherArrayList.get(2));
        teacherArrayList.remove(2);
        System.out.println(teacherArrayList.size());
    }
    public static <T extends People> T findMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List must not be null or empty");
        }

        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        teacherArrayList.add(new Teacher("kanade",0,6000));
        teacherArrayList.add(new Teacher("komiko",1,7000));
        teacherArrayList.add(new Teacher("midori",2,8000));
        teacherArrayList.add(new Teacher("reina",3,3000));
        teacherArrayList.add(new Teacher("yui",4,5000));

        printTeacher(teacherArrayList);

        System.out.println(countSalary(teacherArrayList));

        System.out.println(findSalary(teacherArrayList));

        //rmthird(teacherArrayList);

        System.out.println(findMax(teacherArrayList));

    }
}

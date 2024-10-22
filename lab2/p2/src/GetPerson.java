import java.util.ArrayList;

public class GetPerson {
    public static void main(String[] args)  {
        ArrayList<Person> arr =new ArrayList<>();
        for (int i = 0; i <15 ; i++) {
            arr.add(new Teacher(5000));
            arr.add(new Scientist(5000));
        }

        Utility.setAllID(arr,Scientist.class);
        //静态方法调用
        System.out.println("static");
        Utility.printSalarySum(arr);
        Utility.printSingleSalarySum(arr, Teacher.class.getName());
        Utility.printSingleSalarySum(arr, Scientist.class.getName());
        Utility.printSalary(arr);
        Utility.printArray(arr);
        System.out.println("单例");
        // 使用单例模式提供的全局访问点
        Utility.getInstance().printSalarySum(arr);
        Utility.getInstance().printSingleSalarySum(arr, Teacher.class.getName());
        Utility.getInstance().printSingleSalarySum(arr, Scientist.class.getName());
        Utility.getInstance().printSalary(arr);
        Utility.getInstance().printArray(arr);
    }
}

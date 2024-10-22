import java.util.ArrayList;

/*
*
* 这段代码定义了一个名为Utility的公共最终类，它包含了几个静态方法用于处理
* ArrayList<Person>类型的列表。下面是对每个方法的简要说明和一些潜在的问题点：
* printSalary: 这个方法遍历一个Person对象的列表，并打印出每个对象的名字和它的薪水总和
* 。这里假设Person类有一个返回该实例薪水的方法allSalary()。
* printSingleSalarySum: 这个方法计算并打印特定类型的Person对象的薪水总和。
* 这里使用了getClass().getName()来获取对象的完全限定类名（包名+类名）。但是这里有一个小错误，在注释中提到的检查对象实际类型的条件语句写法是错误的，
* //应该是className.equals(p.getClass().getName())而不是className== arr.getClass().getName()。
* printArray: 这个方法简单地打印整个Person对象列表。默认情况下，这将调用ArrayList的toString()方法，
* 显示列表中所有对象的字符串表示形式。
* printSalarySum: 这个方法计算整个列表中所有Person对象的薪水总和，并打印这个总和。

* 注意：

Utility类应该有一个私有的构造函数来防止外部创建其实例，但这里没有显式声明为私有。
* 如果目的是让这个类成为工具类，那么构造函数应当是私有的，并且可能需要添加一个阻止外部初始化的构造函数，如private Utility() {}。
Person类需要实现allSalary()方法来返回该对象的薪水。
如果Person类有很多子类，并且这些子类覆盖了allSalary()方法来提供不同的实现，则使用getClass().getName()来判断类型可能是合适的
* 。然而，通常更好的做法是在基类中定义一个getClassName()方法或其他标识符来减少对反射API的依赖。
确保在使用这些方法之前，已经正确实现了Person类及其任何必要的子类，并且allSalary()方法返回正确的薪水值。
* 同时也要注意，如果Person列表中包含不同类型的Person子类对象，那么printSingleSalarySum方法中的类型检查逻辑是必要的。
* */
public final class  Utility {
    //类现在是final的，以防止继承
    private static Utility utility =new Utility();
    // 私有构造函数防止外部实例化
    private Utility(){

    }

    // 提供一个公共的静态方法来获取实例
    public static Utility getInstance() {
        return utility;
    }
    public static void printSalary(ArrayList<Person> arr){
        for (Person p:arr ) {
            System.out.print(p.getClass().getName()+": ");
            System.out.print(p.allSalary());
        }
    }
    public static void printSingleSalarySum(ArrayList<Person> arr, String className) {
        int sum = 0;
        for (Person p : arr) {
            if (className.equals(p.getClass().getName())) { // 检查对象的实际类型 if (className== arr.getClass().getName()))比较了array与输入类名
                sum += p.allSalary();

            }
        }
        System.out.println(sum);
    }
    public static void setAllID(ArrayList<Person> arr, Class classs) {
        int sum=0;
        for (Person p : arr) {
            if (classs.equals(p.getClass())) { // 检查对象的实际类型 if (className== arr.getClass().getName()))比较了array与输入类名
               Scientist scientist= (Scientist) p;
                scientist.setID(sum);
                sum++;
            }
        }
        System.out.println(arr);
    }
    public static void printArray(ArrayList<Person> arr){
        System.out.println(arr);

    }
    public static void printSalarySum(ArrayList<Person> arr){
        int sum=0;
        for (Person p:arr ) {
            sum+=p.allSalary();
        }
        System.out.println(sum);
    }

}

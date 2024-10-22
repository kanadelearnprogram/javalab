public class Main {
    public static void main(String[] args) {
        Employee emp= new Employee("kanade",1111,8000);
        System.out.println("employee's name: "+ emp.getName());
        System.out.println("employee's ID: "+ emp.getID());
        System.out.println("employee's salary: "+ emp.getSalary());

        Manager ma=new Manager("kumiko",2222,8000,2000);
        System.out.println("\n");
        System.out.println("manager's name: "+ ma.getName());
        System.out.println("manager's ID: "+ ma.getID());
        System.out.println("manager's salary: "+ ma.getSalary());
        System.out.println("manager's bonus: "+ ma.getBonus());
    }
}

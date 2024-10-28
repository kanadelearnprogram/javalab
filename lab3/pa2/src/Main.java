import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date ddd= new Date();
        Car car =new Car(1,1000,555.55, ddd ,365);

        System.out.println("pNum "+car.getPolocyNumber());
        System.out.println("amount "+car.getCoverAmount());
        System.out.println(car.stareDate);
        System.out.println("enddate "+car.getExpiryDate());
        System.out.println("premium "+car.calculatePremium());


    }
}

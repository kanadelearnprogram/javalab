public class USTax extends Tax{

    public USTax(double price, int num) {
        this.textate=0.3;
       this.allSum = price*num*(1+textate);
    }


    /*@Override
    double addTax(double price, int num) {
        return 0;
    }*/
}

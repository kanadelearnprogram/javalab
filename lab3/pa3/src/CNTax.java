public class CNTax extends Tax{
    public CNTax(double price, int num) {
        this.textate=0.2;
        this.allSum = price*num*(1+textate);
    }



    @Override
    double addTax(double price, int num) {
        return 0;
    }
}

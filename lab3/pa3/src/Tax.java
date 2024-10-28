public abstract class Tax {
    double allSum;

    double textate;
    //abstract double addTax(double price,int num);

    @Override
    public String toString() {
        return " "+allSum;
    }
}

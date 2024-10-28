public class Rectangle extends Shape{
    double a;
    double b;

    @Override
    double getPerim() {
        return 2*(a+b);
    }

    @Override
    double getArea() {
        return a*b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
}

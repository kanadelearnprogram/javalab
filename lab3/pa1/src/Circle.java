public class Circle extends Shape{

    double r;
    @Override
    double getPerim() {
        return  2*3.14*r;
    }

    @Override
    double getArea() {
        return 3.14*r*r;
    }

    Circle(double r){
        this.r=r;
    }

}

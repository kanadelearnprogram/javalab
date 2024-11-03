/**
 * 这段Java代码定义了一个名为 Rectangle 的类，该类继承自 Shape 类。Rectangle 类包含两个私有属性 a 和 b，分别表示矩形的两条边长。类中定义了以下方法：
 * 构造方法 Rectangle(double a, double b)：用于初始化矩形的边长。
 * getPerim() 方法：计算并返回矩形的周长，公式为 2 * (a + b)。
 * getArea() 方法：
 */
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

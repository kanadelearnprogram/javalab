/**
 * 这段代码定义了一个名为 Circle 的类，该类继承自 Shape 类。Circle 类包含一个表示圆半径的成员变量 r，以及两个重写的方法 getPerim 和 getArea，分别用于计算圆的周长和面积。
 * 构造方法 Circle(double r)：初始化圆的半径 r。
 * 方法 getPerim()：计算并返回圆的周长，公式为 2 * π * r，其中 π 用 3.14 表示。
 * 方法 getArea()：计算并返回圆的面积，公式为 π * r * r，其中 π 用 3.14 表示。
 */
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

/**
 * 这段Java代码定义了一个名为 USTax 的类，继承自 Tax 类。主要功能如下：
 * 构造方法：USTax(double price, int num) 初始化对象时，设置税率 textate 为0.3，并计算总价 allSum，公式为 price * num * (1 + textate)。
 *
 */
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

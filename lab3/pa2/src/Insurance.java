import java.util.Date;
/*
*
* 这段Java代码定义了一个名为 USTax 的类，继承自 Tax 类。主要功能如下：
构造方法：USTax(double price, int num) 初始化对象时，设置税率 textate 为0.3，并计算总价 allSum，公式为 price * num * (1 + textate)。
未实现的方法：addTax(double price, int num) 方法被注释掉，没有实际实现。
* */
public interface Insurance {
    int getPolocyNumber();
    int getCoverAmount();
    double calculatePremium();
     Date getExpiryDate();
}

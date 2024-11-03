/*
*
*
* 这段代码定义了一个抽象类 Tax，其中包含两个成员变量 allSum 和 textate。类中重写了 toString 方法，返回 allSum 的字符串表示形式。
功能：
allSum：存储某个总和值。
textate：存储某个税率或其他数值。
toString 方法：返回 allSum 的字符串表示形式，前面加一个空格
*
* */
public abstract class Tax {
    double allSum;

    double textate;
    /*
      计算税收的抽象方法，需要在子类中实现

      @param price 商品价格
     * @param num 商品数量
     * @return 计算出的税收金额
     */
    // abstract double addTax(double price,int num);

    /**
     * 重写toString方法，用于返回总金额的字符串表示
     *
     * @return 总金额的字符串表示
     */
    @Override
    public String toString() {
        return " "+allSum;
    }
}

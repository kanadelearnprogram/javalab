class Order{
    //属性集:客户、订单编号、商品名称、商品标识号、价格、购买数量等。
    //构造函数传入上述信息。

    String id;
    Customer customer;

    String merchandise;
    String merchandiseId;
    double price;
    int number;

    public Order(String id, Customer customer, String merchandise, String merchandiseId, double price, int number) {
        this.id = id;
        this.customer = customer;
        this.merchandise = merchandise;
        this.merchandiseId = merchandiseId;
        this.price = price;
        this.number = number;
    }

    private Tax getTaxObjFromAdress(String address){//根据收货地址获取最
        if(address.indexOf("中国")>=0)
            return new CNTax(price,number);
        if(address.indexOf("USA")>=0)
            return new USTax(price,number);
        return null;
         //为商品加入税率
           // 获取客户地址→从地址获取国别→创建对应税率(如USTax)对象→从税率对象获取应缴税率(double型)→打印订单信息
    }
    public void process(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return
                "订单号:" + id + '\n' +
                "客户:" + customer +
                " 编号:" + merchandiseId + "," +
                " 名称:" + merchandise  +
                "价格:" + price +
                "数量:" + number +"\n"+
                "最终总价:"+getTaxObjFromAdress(customer.address);
    }
}
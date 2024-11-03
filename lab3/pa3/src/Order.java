
/*
* ### 代码功能解释

#### `getTaxObjFromAdress` 方法
- **功能**：根据收货地址获取最合适的税率对象。
- **逻辑**：
  - 检查地址是否包含“中国”，如果是，则返回 `CNTax` 对象。
  - 检查地址是否包含“USA”，如果是，则返回 `USTax` 对象。
  - 如果地址不匹配任何已知国家，则返回 `null`。

#### `process` 方法
- **功能**：处理订单，计算并打印订单信息。
- **逻辑**：
  - 调用 `getTaxObjFromAdress` 方法获取税率对象。
  - 如果税率对象不为 `null`，则调用 `toString` 方法打印订单信息。
  - 如果税率对象为 `null`，则直接返回。

#### `toString` 方法
- **功能**：重写 `toString` 方法，返回订单的详细信息。
- **逻辑**：
  - 返回订单号、客户信息、商品信息和最终总价。
  - 最终总价通过调用 `getTaxObjFromAdress` 方法获取。
### 详细解释

1. **`getTaxObjFromAdress` 方法**：
   - 输入：收货地址 `address`。
   - 处理：
     - 检查地址是否包含“中国”，如果是，则返回 `CNTax` 对象。
     - 检查地址是否包含“USA”，如果是，则返回 `USTax` 对象。
     - 如果地址不匹配任何已知国家，则返回 `null`。

2. **`process` 方法**：
   - 输入：无。
   - 处理：
     - 调用 `getTaxObjFromAdress` 方法获取税率对象。
     - 如果税率对象不为 `null`，则调用 `toString` 方法打印订单信息。
     - 如果税率对象为 `null`，则直接返回。

3. **`toString` 方法**：
   - 输入：无。
   - 处理：
     - 返回订单号、客户信息、商品信息和最终总价。
     - 最终总价通过调用 `getTaxObjFromAdress` 方法获取。
*
* */
class Order{
    // 属性集：客户、订单编号、商品名称、商品标识号、价格、购买数量等。
    // 构造函数传入上述信息。
    String id;
    Customer customer;
    String merchandise;
    String merchandiseId;
    double price;
    int number;

    /**
     * 构造一个新的订单对象。
     *
     * @param id 订单编号
     * @param customer 客户对象
     * @param merchandise 商品名称
     * @param merchandiseId 商品标识号
     * @param price 商品价格
     * @param number 购买数量
     */
    public Order(String id, Customer customer, String merchandise, String merchandiseId, double price, int number) {
        this.id = id;
        this.customer = customer;
        this.merchandise = merchandise;
        this.merchandiseId = merchandiseId;
        this.price = price;
        this.number = number;
    }

    /**
     * 根据收货地址获取最合适的税率对象。
     *
     * @param address 收货地址
     * @return 对应的税率对象，如果没有匹配的税率则返回null
     */
    private Tax getTaxObjFromAdress(String address){
        if(address.indexOf("中国")>=0)
            return new CNTax(price,number);
        // 返回子类对象
        if(address.indexOf("USA")>=0)
            return new USTax(price,number);
        return null;
        // 为商品加入税率
        // 获取客户地址→从地址获取国别→创建对应税率(如USTax)对象→从税率对象获取应缴税率(double型)→打印订单信息
    }

    /**
     * 处理订单，计算并打印订单信息。
     */
    public void process(){
        Tax t=getTaxObjFromAdress(customer.address);// 父类引用指向子类对象
        if(t!=null) {
            System.out.println(this);// 打印调用toString
        } else {
            return ;
        }
    }

    /**
     * 重写toString方法，返回订单的详细信息。
     *
     * @return 订单的详细信息，包括订单号、客户信息、商品信息和最终总价
     */
    @Override
    public String toString() {
        return
                "订单号:" + id + '\n' +
                        "客户:" + customer +// 调用toString
                        " 编号:" + merchandiseId + "," +
                        " 名称:" + merchandise  +
                        "价格:" + price +
                        "数量:" + number +"\n"+
                        "最终总价:"+getTaxObjFromAdress(customer.address)+"\n";
    }
}

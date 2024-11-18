/**
 * The Customer class represents customer information
 * ### 代码解释
 *
 * 这段Java代码定义了一个名为 `Customer` 的类，用于表示客户信息。类中包含三个属性：客户ID、姓名和地址。类中还包含一个构造方法用于初始化这些属性，以及一个 `toString` 方法用于返回客户对象的字符串表示。
 *
 * - **构造方法**：接受三个参数（ID、姓名、地址）并初始化相应的属性。
 * - **toString 方法**：返回一个包含客户ID、姓名和地址的字符串，格式为 `ID,姓名,地址\n`。
 *
 * ### 解释
 *
 * - **A[开始]**：程序开始。
 * - **B[构造方法]**：调用构造方法，初始化客户对象的属性。
 * - **C{是否调用 toString 方法？}**：判断是否调用了 `toString` 方法。
 * - **D[返回字符串表示]**：如果调用了 `toString` 方法，则返回包含客户ID、姓名和地址的字符串。
 * - **E[结束]**：程序结束。
 */
public class Customer {

    // Customer ID
    String ID;
    // Customer name
    String name;
    // Customer address
    String address;

    /**
     * Constructs a Customer object
     *
     * @param ID    the customer ID
     * @param name  the customer name
     * @param address the customer address
     */
    public Customer(String ID, String name, String address) {
        this.ID = ID;
        this.name = name;
        this.address = address;
    }
    /**
     * Returns a string representation of the Customer object
     *
     * @return a string including ID, name, and address
     */
    @Override
    public String toString() {
        return ID  +","+ name +"," + address+ "\n";
    }
}

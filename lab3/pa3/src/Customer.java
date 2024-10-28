public class Customer {

    String ID;
    String name;
    String address;

    public Customer(String ID, String name, String address) {
        this.ID = ID;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return ID  +","+ name +"," + address+ "\n";
    }
}

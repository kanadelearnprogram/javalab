class App{
    public static void main(String[] args) {
        Customer c1,c2;
        c1=new Customer("3601342222197208180030","张三","中国·江西·南昌· 北京西路437号");
        c2=new Customer("987654321","Alan Kay","New Mexico,Rio Rancho, 4100 Sara Roa,USA");
        Order order1=new Order("001",c1,"立柱灯笼","9505900000",150,10000);
        Order order2=new Order("002",c2,"立柱灯笼","9505900000",150, 10000);

        order1.process();
        order2.process();
    }
}


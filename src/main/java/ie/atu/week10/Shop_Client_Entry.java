package ie.atu.week10;

public class Shop_Client_Entry {
    public static void main(String[] args) {
        Person dave = new Person("Dave","GMIT","12345");
        System.out.println(dave);

        Customer John = new Customer("John","ATU","54321","01",true);
        System.out.println(John);
    }
}

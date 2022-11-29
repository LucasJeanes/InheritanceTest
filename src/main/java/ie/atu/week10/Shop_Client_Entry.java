package ie.atu.week10;

import java.util.Scanner;

public class Shop_Client_Entry {
    public static void main(String[] args) {
        //Person dave = new Person("Dave","GMIT","12345");
        //System.out.println(dave);
        String name, address, phoneNum, customerNum, mailList;
        boolean mailingListTrue;

        Customer John = new Customer("John","ATU","54321","01",true);
        System.out.println(John);

        Scanner input = new Scanner(System.in);

        System.out.println("Input the name of a new customer: ");
        name = input.next();

        System.out.println("Input the address of a new customer: ");
        address = input.next();

        System.out.println("Input the phone number of a new customer: ");
        phoneNum = input.next();

        System.out.println("Input the customer number of a new customer: ");
        customerNum = input.next();

        System.out.println("Do they want to be included in the mailing list? Y/N");
        mailList = input.next();

        String str1 = "y";
        String str2 = "Y";

        if(mailList.equals(str1) || mailList.equals(str2)) {
            mailingListTrue = true;
        } else {
            mailingListTrue = false;
        }
        Customer firstCustomer = new Customer(name, address, phoneNum, customerNum, mailingListTrue);
        System.out.println(firstCustomer);
    }
}

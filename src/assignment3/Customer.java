package assignment3;

import java.util.Scanner;

public class Customer {
    protected String codeCustomer, name;
    protected String date;
    protected int quantity;

    public Customer() {

    }

    public Customer(String codeCustomer, String name, String date, int quantity) {
        this.codeCustomer = codeCustomer;
        this.name = name;
        this.date = date;
        this.quantity = quantity;
    }


    public void enter(Scanner sc) {
        String code, n;
        String d;
        int q;

        System.out.print("Nhập vào mã code :");
        code = sc.nextLine();
        sc.nextLine();
        System.out.print("Nhập họ tên :");
        n = sc.nextLine();
        System.out.print("Nhập ngày ra hóa đơn :");
        d = sc.nextLine();
        System.out.print("Nhập vào số lượng :");
        q = sc.nextInt();

        this.codeCustomer = code;
        this.name = n;
        this.date = d;
        this.quantity = q;
    }


    public void inforCustomer(){
        System.out.println("Họ Tên Khách Hàng: " + this.name);
        System.out.println("Mã Khách Hang: " + this.codeCustomer);
        System.out.println("Ngày ra hóa đơn: " + this.date);
        System.out.println("Số KW tiêu thụ: " + this.quantity);
    }

    public double payment() {
        return this.quantity * 1000;
    }
}

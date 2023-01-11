package assignment3;

import java.util.Scanner;

public class ForeignCustomer extends Customer{

    protected String country;

    public ForeignCustomer() {
    }

    public ForeignCustomer(String codeCustomer, String name, String date, int quantity, String country) {
        super(codeCustomer, name, date, quantity);
        this.country = country;
    }

    @Override
    public void enter(Scanner sc) {
        String code, n;
        String d;
        String c;
        int q;

        System.out.print("Nhập vào mã code :");
        code = sc.nextLine();
        code = sc.nextLine();
        System.out.print("Nhập họ tên :");
        n = sc.nextLine();
        System.out.print("Nhập ngày ra hóa đơn :");
        d = sc.nextLine();
        System.out.print("Nhập quốc tịch :");
        c = sc.nextLine();
        System.out.print("Nhập vào số lượng: ");
        q = sc.nextInt();

        this.codeCustomer = code;
        this.name = n;
        this.date = d;
        this.quantity = q;
        this.country = c;
    }

    @Override
    public void inforCustomer() {
        System.out.println("Họ Tên Khách Hàng: " + this.name);
        System.out.println("Mã Khách Hang: " + this.codeCustomer);
        System.out.println("Ngày ra hóa đơn: " + this.date);
        System.out.println("Quốc tịch: " + this.country);
        System.out.println("Số KW tiêu thụ: " + this.quantity);
    }


    @Override
    public double payment() {
        return this.quantity*2000;
    }
}

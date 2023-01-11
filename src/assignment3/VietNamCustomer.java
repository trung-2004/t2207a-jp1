package assignment3;

import java.util.Scanner;

public class VietNamCustomer extends Customer{
    protected String customers;

    public VietNamCustomer() {

    }

    public VietNamCustomer(String codeCustomer, String name, String date, int quantity, String customers) {
        super(codeCustomer, name, date, quantity);
        this.customers = customers;
    }


    @Override
    public void enter(Scanner sc) {
        String code, n;
        String d;
        String c;
        int q;

        System.out.print("Nhập vào mã code :");
        code = sc.nextLine();
        sc.nextLine();
        System.out.print("Nhập họ tên :");
        n = sc.nextLine();
        System.out.print("Nhập ngày ra hóa đơn :");
        d = sc.nextLine();
        System.out.print("Nhập đối tượng khách hàng(sinh hoạt/ kinh doanh/ sản suất) :");
        c = sc.nextLine();
        System.out.print("Nhập vào số lượng :");
        q = sc.nextInt();

        this.codeCustomer = code;
        this.name = n;
        this.date = d;
        this.quantity = q;
        this.customers = c;
    }

    @Override
    public void inforCustomer() {
        System.out.println("Họ Tên Khách Hàng: " + this.name);
        System.out.println("Mã Khách Hang: " + this.codeCustomer);
        System.out.println("Ngày ra hóa đơn: " + this.date);
        System.out.println("Đối tượng khách hàng: " + this.customers);
        System.out.println("Số KW tiêu thụ: " + this.quantity);
    }

    @Override
    public double payment() {
        if (this.quantity<=50) {
            return this.quantity*1000;
        } else if (this.quantity<=100){
            return (this.quantity-50)*1200+50*1000;
        } else if (this.quantity<=200) {
            return (this.quantity-100)*1500+(50*1000)+(50*1200);
        } else {
            return (this.quantity-200)*2000+(50*1000)+(50*1200)+(100*1500);
        }
    }
}

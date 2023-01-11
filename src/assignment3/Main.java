package assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập thông tin khách hàng: ");
        VietNamCustomer v1 = new VietNamCustomer();
//        v1.enter(sc);
//        v1.inforCustomer();
//
//        System.out.print("Thành tiền của khách hàng "+v1.name+" là : "+v1.payment()+" VND\n");
//
//        System.out.println("Nhập thông tin khách hàng: ");
        ForeignCustomer f1 = new ForeignCustomer();
//        f1.enter(sc);
//        f1.inforCustomer();
//        System.out.print("Thành tiền của khách hàng "+f1.name+" là : "+f1.payment()+" VND\n");\

        ArrayList<Customer> list = new ArrayList<>();
        list.add(v1);
        list.add(f1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Nhập thông tin biên lai của Khách Hàng thứ " + (i + 1) + ": ");
            list.get(i).enter(sc);
        }

        System.out.println("Thông tin biên lai của các hộ gia đình: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Thông tin biên lai hộ gia đình thứ " + (i + 1) + ": ");
            list.get(i).inforCustomer();
            System.out.print("Thành tiền của khách hàng "+list.get(i).name+" là : "+list.get(i).payment()+" VND\n");
        }


    }
}

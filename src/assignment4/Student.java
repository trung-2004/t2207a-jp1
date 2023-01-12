package assignment4;

import java.util.Scanner;

public class Student {
    private String name, code, phone, address;
    private double score;

    public Student() {
    }

    public Student(String name, String code, String phone, String address, double score) {
        this.name = name;
        this.code = code;
        this.phone = phone;
        this.address = address;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Student setCode(String code) {
        this.code = code;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Student setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Student setAddress(String address) {
        this.address = address;
        return this;
    }

    public double getScore() {
        return score;
    }

    public Student setScore(double score) {
        this.score = score;
        return this;
    }

    public void enterInforStudent(Scanner sc) {
        String n, c, p, a;
        double s;
        System.out.print("Nhập vào mã: ");
        c = sc.nextLine();
        c = sc.nextLine();
        System.out.print("Nhập vào tên: ");
        n = sc.nextLine();
        System.out.print("Nhập vào điện thoại: ");
        p = sc.nextLine();
        System.out.print("Nhập vào địa chỉ: ");
        a = sc.nextLine();
        System.out.print("Nhập vào điểm thi: ");
        s = sc.nextDouble();

        this.code = c;
        this.name = n;
        this.phone = p;
        this.address = a;
        this.score = s;
    }

    public void inforStudent() {
        System.out.println("Mã: " + this.code);
        System.out.println("Tên: " + this.name);
        System.out.println("Số iện thoại: " + this.phone);
        System.out.println("Địa chỉ: " + this.address);
        System.out.println("Điểm thi: " + this.score);
    }
}

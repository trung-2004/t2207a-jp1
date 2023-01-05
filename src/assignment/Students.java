package assignment;

import java.util.Scanner;

public class Students {
    private String hoTen;
    private int ngaySinh;
    private String diaChi;
    private String tenLop;
    private double diemTB;

    Scanner sc = new Scanner(System.in);
    public Students() {

    }

    public Students(String hoTen, int ngaySinh, String diaChi, String tenLop, double diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.tenLop = tenLop;
        this.diemTB = diemTB;
    }

    public void enter(){
        String name, address, className;
        int day;
        double diem;

        System.out.print("nhap ten: ");
        name = sc.nextLine();
        System.out.print("nhap ngay sinh: ");
        day = sc.nextInt();
        System.out.print("nhap dia chi: ");
        address = sc.nextLine();
        address = sc.nextLine();
        System.out.print("nhap ten lop: ");
        className = sc.nextLine();
        System.out.println("nhap diem trung binh: ");
        diem = sc.nextDouble();

        setHoTen(name);
        setDiemTB(diem);
        setTenLop(className);
        setDiaChi(address);
        setNgaySinh(day);
    }


    public String getHoTen() {
        return hoTen;
    }

    public Students setHoTen(String hoTen) {
        this.hoTen = hoTen;
        return this;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public Students setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
        return this;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public Students setDiaChi(String diaChi) {
        this.diaChi = diaChi;
        return this;
    }

    public String getTenLop() {
        return tenLop;
    }

    public Students setTenLop(String tenLop) {
        this.tenLop = tenLop;
        return this;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public Students setDiemTB(double diemTB) {
        this.diemTB = diemTB;
        return this;
    }

    public void baoCaoKetQua() {
        if (this.diemTB < 5) {
            System.out.println("hoc sinh yeu");
        } else {
            if (this.diemTB < 6.5) {
                System.out.println("hoc sinh trung binh");
            } else {
                if (this.diemTB < 8) {
                    System.out.println("hoc sinh kha");
                } else {
                    System.out.println("hoc sinh gioi");
                }
            }
        }
    }

    public void inThongTin() {
        System.out.println("Ho Ten: " + this.hoTen);
        System.out.println("Ngay Sinh: " + this.ngaySinh);
        System.out.println("Dia Chi: " + this.diaChi);
        System.out.println("Ten Lop: " + this.tenLop);
        System.out.println("Diem Trung Binh: " + this.diemTB);
    }

}

package sesstion1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // phải có hàm này !!!
        System.out.println("Hello world!"); // in ra màn hình

        // Khai báo biến
        int x = 10;
        double y = 3.14;
        String s = "Hello";

        System.out.println("x= "+x);
        y = y + 20 * x;

        // if else
        if (y > 100) {
            System.out.println("y= "+y);
        } else {
            System.out.println("x= "+x);
        }
        // Vòng lặp
        for (int i = 0; i < 10; i++){
            System.out.println("i= "+i);
        }

        // tính s = 1 + 2 + 3 + ... + 1000
        int sum1 = 0;
        for (int k = 1; k <= 1000; k++) {
            sum1 += k;
        }
        System.out.println("Sum1 = "+sum1);

        // tính s = 1 + 1/2 + 1/3 + ... + 1/1000
        double sum2 = 0;
        for (int j = 1; j <= 1000; j++) {
            sum2 += (double)1/j;
        }
        System.out.println("Sum2 = "+sum2);

        // functions
        int a = TinhTong(10, 15);
        System.out.println("a= "+a);
        int b = TinhHieu(10, 15);
        System.out.println("b= "+b);
        int c = TinhTich(10, 15);
        System.out.println("c= "+c);
        double d = TinhThuong(10, 15);
        System.out.println("d= "+d);

        // boolean
        boolean t = true;

        // nhập 1 số nguyên từ bàn phím
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập 1 số nguyên: ");
        int n = sc.nextInt();
        System.out.println("Nhập 1 số thực: ");
        double f = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập 1 string: ");
        String str = sc.nextLine();

        System.out.println("n= "+n);
        System.out.println("f= "+f);
        System.out.println("l= "+str);
    }

    // Khai báo hàm
    static int TinhTong(int a, int b){
        return a+b;
    }
    static int TinhHieu(int a, int b){
        return a-b;
    }
    static int TinhTich(int a, int b){
        return a*b;
    }
    static double TinhThuong(int a, int b){
        return b==0? null : (double) a/b;
    }

}

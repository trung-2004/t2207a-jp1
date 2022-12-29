package assignment;


import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 số nguyên a = ");
        int a = sc.nextInt();
        System.out.print("Nhập 1 số nguyên b = ");
        int b = sc.nextInt();
        if(a>=0 && b>=0 ){
            if(a==0 && b==0)
                System.out.println("khong ton tai UCLN, BCNN");
            else if(a==0 || b==0)
                if (a == 0){
                    System.out.println("khong co BCNN, UCLN = "+a);
                }
                if (b == 0){
                    System.out.println("khong co BCNN, UCLN = "+b);
                }
            else{
                System.out.println("UCLN la "+UCLN(a, b));
                System.out.println("BCNN la "+BCNN(a, b));
            }
        }else
            System.out.println("nhap lai a,b >0:");
    }
    public static int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        int uscln = a;
        return uscln;
    }
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
}

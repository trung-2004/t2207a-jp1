package assignment;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên n = ");
        int n = sc.nextInt();
        if (kiemTra(n)){
            System.out.println(n+" là số hoàn hảo");
        }else {
            System.out.println(n+" không phải là số hoàn hảo");
        }

    }
    static boolean kiemTra(int n){
        int S = 0;
        for (int i = 1; i<n; i++){
            if (n%i == 0){
                S += i;
            }
        }
        if (S == n){
            return true;
        }else {
            return false;

        }
    }

}

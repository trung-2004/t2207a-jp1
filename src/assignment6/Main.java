package assignment6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        News n = new News();

        System.out.println("Nhập id: ");
        n.setID(sc.nextInt());
        System.out.print("Nhập tên: ");
        n.setTitle(sc.nextLine());
        n.setTitle(sc.nextLine());
        System.out.print("Nhập ngày xuất bản: ");
        n.setPublishDate(sc.nextLine());
        System.out.println("Nhập tên tác giả: ");
        n.setAuthor(sc.nextLine());
        System.out.println("Nhập nội dung: ");
        n.setContent(sc.nextLine());

        for (int i = 0; i < n.RateList.length; i++) {
            System.out.print("Nhập vào giá trị cho phần tử thứ "+(i+1)+": ");
            n.RateList[i] = sc.nextInt();
        }
        sc.close();
        n.Calculate();
        n.Display();
    }
}

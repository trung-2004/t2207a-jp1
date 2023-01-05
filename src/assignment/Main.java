package assignment;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Students[] sts = new Students[10];
        sts[0] = new Students("Trung", 2, "Ninh Binh", "T2207A", 1.2);
        sts[1] = new Students("Viet", 27, "Ninh Binh", "T2207A", 4.2);
        sts[2] = new Students("Hieu", 17, "Ha Noi", "T2207A", 3.8);
        sts[3] = new Students("Hiep", 30, "Ha Noi", "T2207A", 2.7);
        sts[4] = new Students("Duc", 12, "Ha Noi", "T2207A", 6.7);
        sts[5] = new Students("Dung", 24, "Ninh Binh", "T2207A", 5.9);
        sts[6] = new Students("Cuong", 23, "Hung Yen", "T2207A", 7.5);
        sts[7] = new Students("Hoang", 5, "Vinh Phuc", "T2207A", 8.2);
        sts[8] = new Students("Vu", 8, "Ha Noi", "T2207A", 9.7);
        sts[9] = new Students("Hung", 19, "Ninh Binh", "T2207A", 10);

        Students max = sts[0];
        Students min = sts[0];

        for (int i = 0; i < sts.length - 1; i++) {
            for (int j = 0; j < sts.length - i - 1; i++) {
                if (sts[i].getDiemTB() < sts[j].getDiemTB()) {
                    Students temp = new Students();
                    temp = sts[j];
                    sts[j] = sts[j + 1];
                    sts[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < sts.length; i++) {
            if (sts[i].getDiemTB() < min.getDiemTB()) {
                min = sts[i];
            }
            if (sts[i].getDiemTB() > max.getDiemTB()) {
                max = sts[i];
            }
        }
        System.out.println("Học sinh " + max.getHoTen() + " có điểm trung bình cao nhất: " + max.getDiemTB());
        System.out.println("Học sinh " + min.getHoTen() + " có điểm trung bình thấp nhất: " + min.getDiemTB());

        System.out.println("Danh sách học sinh giỏi: ");
        for (int i = 0; i < sts.length; i++) {
            if (sts[i].getDiemTB() > 8) {
                System.out.println("Tên: " + sts[i].getHoTen() + " Điểm: " + sts[i].getDiemTB());
            }
        }
    }
}

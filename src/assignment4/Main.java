package assignment4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin học sinh: ");
        Student st1 = new Student();
        st1.enterInforStudent(sc);

        System.out.println("Nhập thông tin học sinh: ");
        Student st2 = new Student();
        st2.enterInforStudent(sc);

        Student st3 = new Student();

        System.out.println("Nhập thông tin lớp học");
        Classroom cl = new Classroom();
        cl.enterInforClassroom(sc);
        cl.addStudent(st1);
        cl.addStudent(st2);
        cl.updateStudent(st2, st3);
        cl.reorganize();
        System.out.println("Thông tin lớp học sau khi sắp xếp: ");
        cl.inforClassroom();
    }
}

package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Classroom {
    private String name, classroom;
    private ArrayList<Student> list = new ArrayList<>();

    public Classroom() {
    }

    public Classroom(String name, String classroom) {
        this.name = name;
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public Classroom setName(String name) {
        this.name = name;
        return this;
    }

    public String getClassroom() {
        return classroom;
    }

    public Classroom setClassroom(String classroom) {
        this.classroom = classroom;
        return this;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public Classroom setList(ArrayList<Student> list) {
        this.list = list;
        return this;
    }

    public void enterInforClassroom(Scanner sc) {
        String n, c;
        System.out.print("Nhập tên lớp: ");
        n = sc.nextLine();
        n = sc.nextLine();
        System.out.print("Nhập phòng học: ");
        c = sc.nextLine();

        this.name = n;
        this.classroom = c;
    }

    public void addStudent(Student st) {
        if (!list.contains(st)) {
            this.list.add(st);
        }
    }

    public void updateStudent(Student oldSt, Student newSt) {
        Scanner sc = new Scanner(System.in);
        if (list.contains(oldSt)) {
            int i = list.indexOf(oldSt);
            System.out.println("Nhập thông tin mới của học sinh "+list.get(i).getName()+": ");
            newSt.enterInforStudent(sc);
            list.set(i, newSt);
        }
    }

    public void inforClassroom() {
        System.out.println("Tên lớp: "+name);
        System.out.println("Phòng học: "+classroom);
        for (int i = 0; i<list.size(); i++){
            list.get(i).inforStudent();
        }
    }

    public void reorganize() {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore() - o1.getScore() > 0 ? 0 : -1;
            }
        });

    }
}

package assignment5;

import assignment2.PhoneNumber;

public class Main {
    public static void main(String[] args) {
        PhoneBook pk1 = new PhoneBook();

        pk1.insertPhone("Trung", "0359080256");
        pk1.insertPhone("Trung", "1234567890");
        pk1.insertPhone("Việt", "0349374618");
        pk1.insertPhone("Dũng", "0349374618");
        pk1.insertPhone("Việt", "03849374623");
        pk1.insertPhone("Hiếu", "03849374623");
        for (int i = 0; i<pk1.PhoneList.size();i++){
            System.out.println(pk1.PhoneList.get(i).getName());
            System.out.println(pk1.PhoneList.get(i).getPhones());
        }
        pk1.removePhone("Việt");
        pk1.removePhone("Kha");
        pk1.updatePhone("Trung", "0359080256", "0367469940");
        pk1.sort();
        for (int i = 0; i<pk1.PhoneList.size();i++){
            System.out.println(pk1.PhoneList.get(i).getName());
            System.out.println(pk1.PhoneList.get(i).getPhones());
        }
    }
}

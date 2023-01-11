package assignment2;

import java.util.ArrayList;

public class PhoneNumber {
    private String name;
    private ArrayList<String> phones = new ArrayList<>();

    public PhoneNumber() {
    }

    public PhoneNumber(String name) {// kiểu dữ liệu arraylist không cần thêm tham số
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public PhoneNumber setName(String name) {
        this.name = name;
        return this;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public PhoneNumber setPhones(ArrayList<String> phones) {
        this.phones = phones;
        return this;
    }

    public void addPhone(String phone) {
        if (!phones.contains(phone)){
            this.phones.add(phone);
        }
    }

    public void updatePhone(String oldPhone, String newPhone) {
        if (phones.contains(oldPhone)){
            int i = phones.indexOf(oldPhone);// tìm vị trí
            phones.add(i, newPhone);// nạp giá trị mới vào vị trí i
        }
    }

    public void deletePhone(String phone) {
        if (phones.contains(phone)){
            phones.remove(phone);
        }
    }
}

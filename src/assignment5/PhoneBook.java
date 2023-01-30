package assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {

    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    void insertPhone(String name, String phone) {
        PhoneNumber pn1 = new PhoneNumber(name);
        if (PhoneList.isEmpty()) {
            PhoneList.add(pn1);
            pn1.getPhones().add(phone);
        } else {
            PhoneNumber pn = searchPhone(name);
            if (pn != null) {
                if (!pn.getPhones().contains(phone)) {
                    PhoneList.get(PhoneList.indexOf(pn)).getPhones().add(phone);
                }
            } else {
                PhoneList.add(pn1);
                pn1.getPhones().add(phone);
            }
        }
    }

    @Override
    void removePhone(String name) {
        if (PhoneList.isEmpty()) {
            System.out.println("Danh bạ trống !");
        } else {
            PhoneNumber pn = searchPhone(name);
            if (pn != null) {
                PhoneList.remove(pn);
                System.out.println("Đã xóa người dùng tên " + name);
            } else {
                System.out.println("Không tìm thấy người dùng tên " + name);
            }
        }
    }

    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {
        if (PhoneList.isEmpty()) {
            System.out.println("Danh bạ trống !");
        } else {
            PhoneNumber pn = searchPhone(name);
            if (pn != null) {
                if (pn.getPhones().contains(oldPhone)) {
                    int i = PhoneList.get(PhoneList.indexOf(pn)).getPhones().indexOf(oldPhone);
                    PhoneList.get(PhoneList.indexOf(pn)).getPhones().set(i, newPhone);
                }
                System.out.println("Đã thay số điện thoại thành công!");
            } else {
                System.out.println("Không tìm thấy người dùng tên " + name);
            }
        }
    }

    @Override
    PhoneNumber searchPhone(String name) {
        for (PhoneNumber pn : PhoneList) {
            if (pn.getName().contains(name)) {
                return pn;
            }
        }
        return null;
    }

    @Override
    void sort() {
        if (PhoneList.isEmpty()) {
            System.out.println("Danh bạ trống !");
        } else {
            Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
        }

    }
}

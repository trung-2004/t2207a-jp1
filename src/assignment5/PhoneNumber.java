package assignment5;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneNumber {
    private String name;
    private ArrayList<String> phones = new ArrayList<>();

    public PhoneNumber() {

    }

    public PhoneNumber(String name) {
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

    public boolean sosanh(PhoneNumber o) {
        if (o.name == this.name){
            return true;
        } else {
            return false;
        }
    }
}

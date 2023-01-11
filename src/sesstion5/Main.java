package sesstion5;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.color = "red";
        a.eat();

        Tiger t = new Tiger();
        t.color = "orange";
        t.eat();
        t.run();
        t.eatMeat();
        t.eatMeat("Hello");
        t.eatMeat("abc", 15);

        Cat c = new Cat();
        c.run();
    }
}

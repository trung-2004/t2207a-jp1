package sesstion5;

public class Tiger extends Animal {
    public void eatMeat() {
        System.out.println("5kg/ngay...");
    }

    public void eatMeat(String smg) {
        System.out.println(smg + " 5kg/ngay...");
    }

    public void eatMeat(String smg, int d) {
        System.out.println(d + " " + smg + " 5kg/ngay...");
    }

    @Override
    public void run() {
        System.out.println("tiger running...");
    }
}

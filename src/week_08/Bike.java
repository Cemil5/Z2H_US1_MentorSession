package week_08;

public class Bike {

    int gear;
    String name = "Mike";
    char ch;

    public void m2(int b) {
        boolean c = true;
        String str = "Mike";
    }
    public void m1() {
        int x = 20;
        m2(10);
    }
}
class BikeTest {
    public static void main(String[] args) {
        int a = 5;
        Bike bike = null;
        bike = new Bike();
        bike.m1();
    }
}


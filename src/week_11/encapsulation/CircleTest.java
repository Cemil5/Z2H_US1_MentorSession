package week_11.encapsulation;

public class CircleTest {

    public static void main(String[] args) {
        Circle circle1 = new Circle(-8);
        System.out.println(circle1.getRadius());
        circle1.setRadius(-15);
        circle1.setRadius(15);
        System.out.println(circle1.getRadius());
        System.out.println(Circle.getNumberOfCircle());

        Circle circle2 = new Circle(5);
        System.out.println(Circle.getNumberOfCircle());
        System.out.println(circle2.calculateArea());
        System.out.println(circle2.calculatePerimeter());

        Circle circle3 = new Circle();
        circle3.setRadius(-6);
        System.out.println(circle3.getRadius());
        circle3.setRadius(11);

    }
}

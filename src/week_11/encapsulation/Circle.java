package week_11.encapsulation;

public class Circle {

    private double radius;
    private static int numberOfCircle;

    public Circle() {
        numberOfCircle++;
    }

    public Circle(double radius) {
        setRadius(radius);
        numberOfCircle++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {  //we defined the constraints and make a detailed contract with user.
        if (radius < 0) {
            System.out.println("Radius can not be lower than Zero. Previous value has kept");
            return;
        }
        this.radius = radius;
    }

    public static int getNumberOfCircle() {
        return numberOfCircle;
    }

    public double calculateArea() {
        if (radius == 0) {
            return 0;
        }
        return radius * radius * Math.PI;
    }

    public double calculatePerimeter() {
        if (radius == 0) {
            return 0;
        }
        return 2 * Math.PI * radius;
    }
}

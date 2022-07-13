package week_13;

/**
A real estate agent asked you to write a program. He said that he has properties in the shapes of squares, rectangles,
circles, etc., and that he wants to market them by filtering according to the square meters in line with the wishes of his customers.

Hints:
Each property's name and features will be kept as an ArrayList.
Define an abstract class to keep name of the properties and calculate the area.
Define subclasses to calculate the area of each shape.
Write a method that will take this ArrayList and return a property list whose areas are equal or more than the request of a client.

Example:
input :
properties of real estate agent :
    Square Houses
        SquareHouse-1 with 20 m side,
        SquareHouse-2 with 25 m side,
        SquareHouse-3 with 30 m side
    Rectangle Houses
        RectangleHouse-1 with 20 x 30,
        RectangleHouse-2 with 20 x 25
    Circle Houses
        CircleHouse-1 with 15 m radius,
        CircleHouse-2 20 m radius,
        CircleHouse-3 10 m radius

customer request : Houses with area under 600 square meters will not be accepted...

output :
[SquareHouse-2 , SquareHouse-3 , RectangleHouse-1 , CircleHouse-1 , CircleHouse-2 ]
 */

public abstract class House {
    private String name;

    public House(String name) {
        this.name = name;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return  name + " ";
    }
}

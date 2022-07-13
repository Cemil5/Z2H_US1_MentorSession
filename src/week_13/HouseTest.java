package week_13;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseTest {
    public static void main(String[] args) {
        ArrayList<House> list = new ArrayList<>(Arrays.asList(
                new Square("SquareHouse-1", 20),
                new Square("SquareHouse-2", 25),
                new Square("SquareHouse-3", 30),
                new Rectangle("RectangleHouse-1", 20, 30),
                new Rectangle("RectangleHouse-2", 20, 25),
                new Circle("CircleHouse-1", 15),
                new Circle("CircleHouse-2", 20),
                new Circle("CircleHouse-3", 10),
                new Triangle("Triangle-1", 10, 15)
        ));

        int customerRequest = 500;

        System.out.println(filterProperties(list, customerRequest));
    }

    public static ArrayList<House> filterProperties(ArrayList<House> houses, int minArea){
        ArrayList<House> result = new ArrayList<>();
        for (House house : houses) {
            if (house.getArea() >= minArea){
                result.add(house);
            }
        }
        return result;
    }
}

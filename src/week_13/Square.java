package week_13;

public class Square extends House {
    private int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }


    @Override
    public double getArea() {
        return side*side;
    }
}

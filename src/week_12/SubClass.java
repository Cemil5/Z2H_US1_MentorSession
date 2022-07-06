package week_12;

public class SubClass extends ParentClass{
    @Override
    protected void a_method() {
        System.out.println("This is abstract method");
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.a_method();
        subClass.b_method();
    }
}

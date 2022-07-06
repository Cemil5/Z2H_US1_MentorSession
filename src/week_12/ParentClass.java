package week_12;
/*
Create an abstract class that has a constructor which prints
"This is constructor of abstract class", an abstract method named ‘a_method' and
a non-abstract method which prints "This is a normal method of abstract class".
A class 'SubClass' inherits the abstract Class and has a method named ‘a_method' which prints "This is abstract method”.
Now create an Object of 'SubCIass' and call these methods (Analyze the result)

 */
public abstract class ParentClass {
    public ParentClass(){
        System.out.println("This is constructor of abstract class");
    }

    protected abstract void a_method();

    protected void b_method(){
        System.out.println("This is a normal method of abstract class");
    }

}

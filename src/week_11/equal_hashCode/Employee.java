package week_11.equal_hashCode;

import java.util.Objects;

public class Employee {
    private String name;
    private int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == this) {
//            return true;
//        }
//        if (!(obj instanceof Employee)) {
//            return false;
//        }
//        Employee emp = (Employee) obj;
//        return name.equals(emp.name) && age == emp.age;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class EqualsExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Jhon", 19);
        Employee emp2 = new Employee("Jhon", 19);
        //Comparing the two objects
        System.out.println(emp1.equals(emp2));
    }

}

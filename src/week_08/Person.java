package week_08;

public class Person {
    int id;
    String name;

    public void setInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class PersonBuilder {

    public static void main(String[] args) {
        int id = 23;
        String name = "John";
        Person person = new Person();
        person.setInfo(id, name);
    }
}

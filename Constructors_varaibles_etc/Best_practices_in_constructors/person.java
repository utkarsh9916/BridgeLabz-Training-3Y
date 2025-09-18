class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class person {
    public static void main(String[] args) {
        Person p1 = new Person("Utkarsh", 21);
        Person p2 = new Person(p1); // clone

        p1.display();
        p2.display();
    }
}

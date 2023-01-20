package interfaces;

public class Test {
    public static void main (String[] args) {

        Animal animal1 = new Animal(2);
        Person person1 = new Person("Dima");

        animal1.sleep();
        person1.sayHello();

    }
}

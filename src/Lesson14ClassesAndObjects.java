public class Lesson14ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;
        System.out.println("my name is " + person1.name + ", I'm " + person1.age + " years");

        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 22;
        System.out.println("my name is " + person2.name + ", I'm " + person2.age + " years");

    }
}
    class Person {
        String name;
        int age;
}


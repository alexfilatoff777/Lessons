public class Lesson15Methods {
    public static void main(String[] args) {
        PersonT person1 = new PersonT();
        person1.name = "Roman";
        person1.age = 50;
        person1.speak();

        PersonT person2 = new PersonT();
        person2.name = "Vova";
        person2.age = 22;
        person2.speak();

    }
}
class PersonT {
    String name;
    int age;
    void speak() {
        for (int i = 0; i<3; i++)
        System.out.println("My name is "+name+". I'm "+age+" years.");
    }
}


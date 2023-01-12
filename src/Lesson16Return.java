public class Lesson16Return {
    public static void main(String[] args) {
        PersonQ person1 = new PersonQ();
        person1.name = "Roman";
        person1.age = 50;
        person1.speak();
        System.out.println(person1.calculateYears());

        PersonQ person2 = new PersonQ();
        person2.name = "Vova";
        person2.age = 22;
        person1.speak();
        System.out.println(person2.calculateYears());

    }
}
class PersonQ {
    String name;
    int age;
    void speak() {
        for (int i = 0; i<1; i++)
            System.out.println("My name is "+name+". I'm "+age+" years.");
    }

    int calculateYears() {
        int years = 65-age;
        return years;

    }
}

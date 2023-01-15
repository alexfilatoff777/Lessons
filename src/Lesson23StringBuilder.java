public class Lesson23StringBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello!");
        System.out.println(s.toString());
        s.append(" my");
        s.append(" friend!");
        System.out.println(s.toString());
        s.append(" How").append(" are").append(" you?");
        System.out.println(s.toString());

String name = "Sasha";
int age = 27;
        var left = 0.6f;
        System.out.printf("My name is %s, I'm  %d, perhaps %f left", name, age, left);
        System.out.printf("My name is %s, I'm  %d, perhaps %.1f left", name, age, left);


    }
}

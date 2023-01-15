public class Lesson24ObjectClass {
    public static void main(String[] args) {
        HumanO h1 = new HumanO("Dima", 29);
String b = h1.toString();
        System.out.println(h1.toString());
        System.out.println(b);


    }
}

class HumanO {
    private String name;
    private int age;
    public HumanO(String name, int age){
        this.name = "name"; this.age = age;
    }
    public String toString (){
        return name+", "+age;
    }
    }

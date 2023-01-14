public class Lesson20Constructor {
    public static void main(String[] args) {
        HumanR h1 = new HumanR("Dima", 29);
        System.out.println(h1.getName());
        HumanR h2 = new HumanR();
        System.out.println(h2.getName());

    }
}

class HumanR {
    private String name;
    private int age;
    public HumanR(){
        this.name = "name"; this.age = 0;
    }
    public HumanR(String name, int age){
        System.out.println("Hello from the 1st constructor!");
        this.name = name; this.age = age;
    }
    public void setName(String name, int age){
        this.name = name; this.age = age;
    }
    public String getName(){
        String a = ", ";
        return name+a+Integer.toString(age);
    }
}

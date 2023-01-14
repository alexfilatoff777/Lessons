public class Lesson21Static {
    public static void main(String[] args) {
HumanTr.desc = "Hello!";
        HumanTr h1 = new HumanTr("Loh", 27);
        h1.getAll();
        HumanTr.desc = "Oups!";
        HumanTr h2 = new HumanTr("Tommy", 19);
          h2.getAll();

    }
}

class HumanTr {
    private String name;
    private int age;
    public static String desc;
    public HumanTr(){
        this.name = "name"; this.age = 0;
    }
    public HumanTr(String name, int age){
        this.name = name; this.age = age;
    }
    public void setName(String name, int age){
        this.name = name; this.age = age;
    }
    public String getName(){
        String a = ", ";
        return name+a+Integer.toString(age);
    }
    public void getAll(){
        System.out.println(name+", "+age+", "+desc);
    }
}

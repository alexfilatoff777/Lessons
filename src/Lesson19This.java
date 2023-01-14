public class Lesson19This {
    public static void main(String[] args) {
        HumanE h1 = new HumanE();
        h1.setNameAndAge("Dima", 22);
        System.out.println("Name: "+h1.name+". Age: "+h1.age);
    }
}

    class HumanE{
     String name;
     int age;
     public void setNameAndAge(String name, int age){
         this.name = name;
         this.age=age;
     }
     public String getName(){
         return name;
     }
     public int getAge(){
         return age;
     }
    }

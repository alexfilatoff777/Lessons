public class Dog extends Animal {
    String name = "Casper"; int age = 9;
    public void bark(){
        System.out.println("Dog is barking ");
    }
    public void eat(){
        System.out.println("Dog is eating ");
    }
    public void sleep(){
        System.out.println("Dog is sleeping ");
    }
    public void showNameAndAge(){
        System.out.println(name+age);
    }

}

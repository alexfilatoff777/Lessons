import java.util.Scanner;
public class Lesson6If {
    public static void main (String[] args) {
if (5>-2) {
    System.out.println("Yes, true!");

    if (5 < 0) {
        System.out.println("Yes, true!");
    } else {
        System.out.println("False");
    }
}

    oneOrTwo();
}

    static void oneOrTwo(){
        System.out.println("enter 1 or 2");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 1) {
            System.out.println("Вы ввели 1");}
        else if (i == 2) {
            System.out.println("You entered 2");}
        else {
            System.out.println("error");
        }
    }
}

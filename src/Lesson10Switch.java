import java.util.Scanner;
public class Lesson10Switch {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Enrter age");
int age = scanner.nextInt();
    switch (age){
        case 0 :
            System.out.println("you born");
            break;
        case 7 :
            System.out.println("you went to school");
            break;
        case 18 :
            System.out.println("you've finished school");
            break;
        default:
            System.out.println("nothing");
    }


        System.out.println("Enrter age");
        String ageS = scanner.nextLine();
        switch (ageS){
            case "0" :
                System.out.println("you born");
                break;
            case "seven" :
                System.out.println("you went to school");
                break;
            case "18" :
                System.out.println("you've finished school");
                break;
            default:
                System.out.println("nothing");
        }

    }
}

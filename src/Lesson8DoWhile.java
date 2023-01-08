import java.util.Scanner;
import java.util.SortedMap;

public class Lesson8DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String n;
        do {
            System.out.println("Enter n");
            n = scanner.nextLine();
        }
        while (!n.equals("n"));
        System.out.println("you entered n");

        enter5();
        mainY();
    }

    static void enter5() {
        Scanner scanner = new Scanner(System.in);

        int value;
        do {
            System.out.println("enter 5");
            value = scanner.nextInt();
        }
        while (value != 5);
        System.out.println("you entered 5!");
    }

    static void mainY() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String y = " ";
        System.out.println("enter y");
        y = scanner.nextLine();
        while (!y.equals("y")) {
            System.out.println("error. need y");
            y = scanner.nextLine();
        }
        System.out.println("ok");
    }
}



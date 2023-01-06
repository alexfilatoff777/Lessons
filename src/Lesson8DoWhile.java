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
        main2();
        main3();
    }

    static void main2() {
        Scanner scanner = new Scanner(System.in);

        int value;
        do {
            System.out.println("enter 5");
            value = scanner.nextInt();
        }
        while (value != 5);
        System.out.println("you entered 5!");
    }

    static void main3() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter y");
        String y = " ";
        while (!y.equals("y")) {
            y = scanner.nextLine();
            System.out.println("error. need y");
        }
        System.out.println("ok");
    }
}



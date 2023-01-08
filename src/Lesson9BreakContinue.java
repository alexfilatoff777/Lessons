import java.util.Scanner;
public class Lesson9BreakContinue {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int i = 0;
        while (true) {
            if (i >= 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("i = 15. Мы вышли из цикла");

        System.out.println("Enter r");
        Scanner scanner = new Scanner(System.in);
        scanR(scanner.nextLine());
        System.out.println("Второй метод");
        System.out.println("Enter r");
        R();

    }

        public static String scanR(String r) {
        while (true) {
            if (r.equals("r")) {
                break;
            }
            System.out.println("Error. Enter r");
            Scanner scanner = new Scanner(System.in);
            r = scanner.nextLine();
        }
        return r;
    }


    public static void R (){
        Scanner scanner = new Scanner(System.in);
        String r = scanner.nextLine();
        while (true) {
            if (r.equals("r")) {
                break;
            }
            System.out.println("Error. Enter r");
            r = scanner.nextLine();
        }

    }
}

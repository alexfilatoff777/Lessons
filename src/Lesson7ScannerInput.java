import java.util.Scanner;

public class Lesson7ScannerInput {
public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("ВВЕДИТЕ ЧТО-НИБУДЬ");
    String st = scanner.nextLine();
    System.out.println("вы ввели: "+st);

}

}

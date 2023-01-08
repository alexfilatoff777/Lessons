import java.util.Scanner;
public class Lesson11Arrays {
    public static void main(String[] args) {
        int num = 10;
        char a;

        int[] n = new int[5];
        n[4] = 10;

        System.out.println(n[4]);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }

        int n1[] = {1, 2, 3, 4, 5};
        for (int x = 0; x < n1.length; x++) {
            System.out.println(n1[x]);
        }
    }
}

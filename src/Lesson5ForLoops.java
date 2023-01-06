public class Lesson5ForLoops {
    public static void main(String[] args) {

        for (int i = 0; i <10; i++)  {
            System.out.println("Hello "+(i+1));
        }

        String[] baza = {"fufu", "2", "4", "kuku"};

        for (int i = 0; i<baza.length; i=i+2 ) {
            System.out.println(baza[i]);
        }

        for (int i = 8; i>=-2; i = i-2) {
            System.out.println("Этаж "+i);
        }

    }

}
public class ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i <10; i++)  {
            System.out.println("Hello "+(i+1));
        }

        String[] baza = {"1", "2", "4", "kuku"};

        for (int i = 0; i<baza.length; i++ ) {
            System.out.println(baza[i]);
        }

        for (int i = 8; i>-3; i = i-2) {
            System.out.println("Этаж "+i);
        }

    }

}


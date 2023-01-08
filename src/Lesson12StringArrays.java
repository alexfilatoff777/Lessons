public class Lesson12StringArrays {
    public static void main(String[] args) {
        int[] a = new int[5];
        String[] b = new String[3];
        b[0] = "hello";
        b[1] = "goodbay";
        b[2] = "java";
        System.out.println(b[0]+ " "+ b[2]);
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);}
        System.out.println();
        for(String x:b){
            System.out.println(x);
        }

        int[]c= {2,4,6};
        int sum = 0;
        for (int y:c) { sum = sum+y;
        }
        System.out.println(sum);

        System.out.println(b.length);
        }


    }

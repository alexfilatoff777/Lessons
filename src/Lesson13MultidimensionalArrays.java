public class Lesson13MultidimensionalArrays {
    public static void main(String[] args) {
        int[]num = {1,2,3,4};
        int[][] matrice = {{1,2,3},{3,4,5},{7,8,9}};

        System.out.println(matrice[0][2]);
        System.out.println(matrice[1][1]);

        String[][] massive = new String[3][3];
        massive[0][0] = "qwerty";
        System.out.println(massive[0][0]);

        //Вывод на экран:

        for (int i = 0; i<matrice.length; i++){
            for (int j = 0; j<matrice[i].length; j++){
                System.out.println(matrice[i][j]+ " ");
            }
            System.out.println();
        }

    }


}

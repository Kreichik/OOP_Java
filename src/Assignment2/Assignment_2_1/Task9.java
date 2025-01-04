package Assignment2.Assignment_2_1;

public class Task9 {
    public static int[][] result = new int[10][];
    public static void main(String[] args) {
        int[][] array = new int[10][];
        for (int i = 0; i < array.length; i++){
            array[i] = new int[i+1];
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = i+j;
            }
        }


        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
                }
            System.out.println();
        }
    }
}

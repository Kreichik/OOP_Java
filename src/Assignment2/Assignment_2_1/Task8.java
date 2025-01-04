package Assignment2.Assignment_2_1;
/*
Initialize the MULTIPLICATION_TABLE array with the value new int[10][10], fill it with the
multiplication table and output it to the console as follows:

 */
public class Task8 {
    public static int[][] MULTIPLICATION_TABLE;
    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
        }

}

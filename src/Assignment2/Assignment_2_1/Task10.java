package Assignment2.Assignment_2_1;

import java.util.Scanner;

public class Task10 {
    public static int[][] multiArray;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] result = new String[n][];

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            result[i] = new String[m];
            for (int j = 0; j < m; j++) {
                result[i][j] = "[]";
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}

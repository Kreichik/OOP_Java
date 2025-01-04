package Assignment2.Assignment_2_1;

import java.util.Scanner;

public class Task16 {
    public static char[][] array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array = new char[n][2*n-1];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '-';
            }
        }

        for (int i = 0; i < n; i++) {
            int start = n - 1 - i;
            int end = n - 1 + i;
            for (int j = start; j <= end; j++) {
                array[i][j] = '#';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

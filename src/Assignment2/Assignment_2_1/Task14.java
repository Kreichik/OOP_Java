package Assignment2.Assignment_2_1;

import javax.swing.*;
import java.util.Scanner;

public class Task14 {
    public static int[][] array = new int[3][3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int[] sum_col_array = new int[3];
        int sum_col = 0;
        int[] sum_row_array = new int[3];
        int sum_row = 0;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum_col += array[j][i];
            }
            sum_col_array[i] = sum_col;
            sum_col = 0;

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum_row += array[i][j];
            }
            sum_row_array[i] = sum_row;
            sum_row = 0;
        }



        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int min_col = sum_col_array[0];
        int min_row = sum_row_array[0];
        for (int i = 0; i < 3; i++) {
            if (min_col > sum_col_array[i]) {
                min_col = sum_col_array[i];
            }
        }

        for(int i = 0; i<3; i++) {
            if(min_row > sum_row_array[i]) {
                min_row = sum_row_array[i];
            }
        }

        System.out.println(min_row + " " + min_col);

    }
}

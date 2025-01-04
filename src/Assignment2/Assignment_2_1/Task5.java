package Assignment2.Assignment_2_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner concsol = new Scanner(System.in);
        int n = concsol.nextInt();
        if (n > 0) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = concsol.nextInt();
            }
            if (n%2 == 0) {
                for (int i = n-1; i >= 0; i--) {
                    System.out.print(arr[i] + " ");
                }
            }
            else {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
            }

        }

    }
}

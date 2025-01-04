package Assignment2.Assignment_2_1;

import java.util.Scanner;

public class Task6 {
    public static int[] array;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}

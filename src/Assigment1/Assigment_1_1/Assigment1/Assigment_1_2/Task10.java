package Assigment1.Assigment_1_1.Assigment1.Assigment_1_2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        int sum = 0;

        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum += i;
        }

        System.out.println(sum);
    }
}

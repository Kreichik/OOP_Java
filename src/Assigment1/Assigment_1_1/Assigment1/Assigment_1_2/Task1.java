package Assigment1.Assigment_1_1.Assigment1.Assigment_1_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp <= 0) {
            System.out.println("it’s cold outside");
        }
        else {
            System.out.println("it’s warm outside");
        }
    }
}

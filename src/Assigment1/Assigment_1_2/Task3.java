package Assigment1.Assigment_1_2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float temp = scanner.nextFloat();
        boolean isHigh = temp > 36.6;
        boolean isLow = temp < 35;
        if (isHigh) {
            System.out.println("The temperature is high");
        }
        else if (isLow) {
            System.out.println("The temperature is low");
        }
        else {
            System.out.println("The temperature is normal");
        }

    }
}

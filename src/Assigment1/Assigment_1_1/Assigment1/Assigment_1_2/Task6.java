package Assigment1.Assigment_1_1.Assigment1.Assigment_1_2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        int sum = 0;
        while (!data.equals("ENTER")) {
            sum += Integer.parseInt(data);
            data = scanner.nextLine();
        }

        System.out.println(sum);
    }
}

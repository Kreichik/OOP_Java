package Assignment2.Assignment_2_1;

import java.util.Scanner;

/*
In this task, you need to:
1. Read 6 strings and fill the strings array with them.
2. Remove repeated strings from the strings array, replacing them
with null (nulls must not be "null" strings)
 */
public class Task7 {
    public static String[] strings = new String[6];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i] == null) {
                    continue;
                }
                if (strings[i].equals(strings[j])) {
                    strings[j] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }
}

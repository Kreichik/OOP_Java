package Assignment2.Assignment_2_2;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }
    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[array.length - 1 - i] + ", ");
        }
        System.out.println();
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

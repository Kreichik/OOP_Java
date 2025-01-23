package Assignment3.Assignment_3_2;
import java.util.Arrays;

public class Task11 {
    public static class Memory {

        public static void main(String[] args) {
            String[] memory = {"object15", null, null, "object2", null, null, null, null,
                    "object32", null, "object4"};
            executeDefragmentation(memory);
            System.out.println(Arrays.toString(memory));
        }

        public static void executeDefragmentation(String[] array) {
            int nonNullIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    array[nonNullIndex++] = array[i];
                }
            }
            while (nonNullIndex < array.length) {
                array[nonNullIndex++] = null;
            }
        }
    }
}

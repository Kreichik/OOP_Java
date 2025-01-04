package Assignment2.Assignment_2_1;

public class Task11 {
    public static int[][][] multiarray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};
    public static void main(String[] args) {
        for (int i = 0; i < multiarray.length; i++) {
            for (int j = 0; j < multiarray[i].length; j++) {
                for (int k = 0; k < multiarray[i][j].length; k++) {
                    System.out.print(multiarray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}

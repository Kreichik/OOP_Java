package Assignment3.Assignment_3_1;

public class Task9 {
    public static void main(String[] args) {}
    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly canFly);
    }
}

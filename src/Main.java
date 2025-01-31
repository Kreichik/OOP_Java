//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    interface Movable {
        void move();
    }

    class Car implements Movable {
        public void move() {
            System.out.println("Car is moving");
        }
    }
    public static void main(String[] args) {
    }
}
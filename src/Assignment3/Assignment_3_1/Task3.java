package Assignment3.Assignment_3_1;

public class Task3 {
    public static void main(String[] args) {

    }
    public interface CanFly {
        public void fly();
    }
    public interface CanRun {
        public void run();
    }
    public interface CanSwim {
        public void swim();
    }
    public class Human implements CanRun, CanSwim {
        public void run() {
        }

        public void swim() {
        }
    }

    public class Duck implements CanFly, CanRun, CanSwim {
        public void fly() {
        }

        public void swim() {
        }

        public void run() {
        }
    }

    public class Penguin implements CanRun, CanSwim {
        public void run() {
        }

        public void swim() {
        }
    }

    public class Airplane implements CanFly {
        public void fly() {
        }
    }
}

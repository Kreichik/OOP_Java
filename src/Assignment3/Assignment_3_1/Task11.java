package Assignment3.Assignment_3_1;

public class Task11 {
    public static void main(String[] args) {}
    public interface Movable {
        void move();
    }

    public interface Edible {
        void beEaten();
    }

    public interface Eat {
        void eat();
    }

    public class Cat implements Movable, Eat, Edible {
        public void move() {
        }

        public void eat() {
        }

        public void beEaten() {
        }
    }

    public class Mouse implements Movable, Edible {
        public void move() {
        }

        public void beEaten() {
        }
    }

    public class Dog implements Movable, Eat {
        public void move() {
        }

        public void eat() {
        }
    }
}

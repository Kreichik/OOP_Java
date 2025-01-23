package Assignment3.Assignment_3_1;

public class Task16 {
    public static void main(String[] args) throws Exception {
        Fox fox = new Fox();
        System.out.println(fox.getName());
        System.out.println(fox.getColor());
        System.out.println(fox.getAge());
    }

    public interface Animal {
        String getColor();
        Integer getAge();
    }

    public static class Fox implements Animal {
        @Override
        public String getColor() {
            return "Red";
        }

        @Override
        public Integer getAge() {
            return 5;
        }

        public String getName() {
            return "Fox";
        }
    }
}

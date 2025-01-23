package Assignment3.Assignment_3_2;

public class Task5 {
    public static class Building {
        private String type;

        public void initialize(String type) {
            this.type = type;
            System.out.println("Building type is now: " + this.type);
        }

        public static void main(String[] args) {
            Building building = new Building();
            building.initialize("Restaurant");
            building.initialize("Barbershop");
        }
    }
}

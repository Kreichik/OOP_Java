package Assignment3.Assignment_3_2;

public class Task4 {
    public static class CarConcern {
        private final String manufacturer = "Lamborghini";
        private final String model;
        private final int year;
        private final String color;

        public CarConcern(String model, int year, String color) {
            this.model = model;
            this.year = year;
            this.color = color;
        }

        public CarConcern(String model, int year) {
            this.model = model;
            this.year = year;
            this.color = "Orange"; // default color
        }

        public CarConcern(String model) {
            this.model = model;
            this.year = 4321;
            this.color = "Orange";
        }

        public static void main(String[] args) {
            CarConcern car1 = new CarConcern("Aventador", 2021, "Red");
            CarConcern car2 = new CarConcern("Huracan", 2020);
            CarConcern car3 = new CarConcern("Gallardo");

            System.out.println("Car 1: " + car1.model + ", " + car1.year + ", " + car1.color);
            System.out.println("Car 2: " + car2.model + ", " + car2.year + ", " + car2.color);
            System.out.println("Car 3: " + car3.model + ", " + car3.year + ", " + car3.color);
        }
    }
}

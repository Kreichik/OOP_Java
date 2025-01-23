package Assignment3.Assignment_3_2;

public class Task16 {
    private String model;
    private int year;
    private String color;

    public void initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        Task16 car = new Task16();
        car.initialize("Tesla Model S", 2022, "Red");
        car.displayInfo();
    }
}

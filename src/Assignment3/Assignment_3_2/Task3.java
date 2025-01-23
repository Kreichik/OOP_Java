package Assignment3.Assignment_3_2;

public class Task3 {
    private int floorsCount;
    private String developer;

    public Task3() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
        System.out.println("Skyscraper is built. The number of floors is " + floorsCount);
        System.out.println("Skyscraper is built. Developer - " + developer);
    }

    public Task3(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
        System.out.println("Skyscraper is built. The number of floors is " + floorsCount);
        System.out.println("Skyscraper is built. Developer - " + developer);
    }

    public static void main(String[] args) {
        Task3 skyscraper = new Task3();
        Task3 skyscraperUnknown = new Task3(50, "Unknown");
    }
}

package Assignment3.Assignment_3_2;

public class Task2 {
    public static final String SKYSCRAPER_WAS_BUILD = "Skyscraper is built.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Skyscraper is built. The number of floors - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Skyscraper is built. Developer - ";

    public Task2() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public Task2(int floors) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floors);
    }

    public Task2(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }

    public static void main(String[] args) {
        Task2 skyscraper = new Task2();
        Task2 skyscraperTower = new Task2(50);
        Task2 skyscraperSkyline = new Task2("JavaRushDevelopment");
    }
}

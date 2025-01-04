package Assignment2.Assignment_2_2;

public class Task12 {
    public static String city = "Токио";
    public static double population = 34.5;
    public static void main(String[] args) {
        printCityPopulation("Джакарта", 25.3);
        printCityPopulation("Сеул", 25.2);
        printCityPopulation("Дели", 23.1);
        printCityPopulation("Нью-Йорк", 21.6);
    }
    public static void printCityPopulation(String city, double population){
        System.out.println("Население города " + city + " составляет " + population + " млн человек.");
        System.out.println("В то время как в самом густонаселенном городе " + Task12.city + " население составляет " + Task12.population + " млн человек.");
    }
}

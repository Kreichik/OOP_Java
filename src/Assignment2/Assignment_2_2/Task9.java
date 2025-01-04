package Assignment2.Assignment_2_2;

public class Task9 {
    public static void main(String[] args) {
        Person person = new Person("Иван",
                "Иванов");
        System.out.println("Досье.");
        System.out.println("Имя: " +
                person.getFirstName());
        System.out.println("Фамилия: " +
                person.getLastName());
        System.out.println("Полное имя: " +
                person.getFullName());
    }

}

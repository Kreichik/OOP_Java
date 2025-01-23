package Assignment3.Assignment_3_2;

public class Task6 {
    public static class Bugatti {
        private String color = "BLACK";
        private int year = 2020;
        private String body = "Coupe";

        public Bugatti() {
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public static void main(String[] args) {
            Bugatti myCar = new Bugatti();
            System.out.println("Current body: " + myCar.getBody());
            myCar.setBody("Convertible");
            System.out.println("New body: " + myCar.getBody());
        }
    }
}

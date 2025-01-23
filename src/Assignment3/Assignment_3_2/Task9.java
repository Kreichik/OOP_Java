package Assignment3.Assignment_3_2;

public class Task9 {
    public static class Iphone {
        private String model;
        private String color;
        private int price;

        public Iphone(String model, String color, int price) {
            this.model = model;
            this.color = color;
            this.price = price;
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Iphone iphone = (Iphone) obj;
            return price == iphone.price &&
                    model.equals(iphone.model) &&
                    color.equals(iphone.color);
        }

        public static void main(String[] args) {
            Iphone iphone1 = new Iphone("X", "Black", 999);
            Iphone iphone2 = new Iphone("X", "Black", 999);

            System.out.println(iphone1.equals(iphone2));
        }
    }
}

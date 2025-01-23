package Assignment3.Assignment_3_2;

public class Task12 {
    public static class Market {
        private static boolean hasEggs = true;

        public static void main(String[] args) {
            boolean hasEggs = false;
            makePurchases(hasEggs);
        }

        public static void makePurchases(boolean hasEggs) {
            if (hasEggs) {
                System.out.println("Bought 10 eggs");
            } else {
                System.out.println("Bought 1 loaf");
            }
        }
    }
}

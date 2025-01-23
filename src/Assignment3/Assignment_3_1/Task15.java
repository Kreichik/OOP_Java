package Assignment3.Assignment_3_1;

public class Task15 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    static class Screen implements Updatable {
        public void onSelect() {
            System.out.println("Screen selected.");
        }

        public void refresh() {
            System.out.println("Screen refreshed.");
        }
    }
}

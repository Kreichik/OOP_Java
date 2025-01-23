package Assignment3.Assignment_3_2;

public class Task15 {
    public class Africa {
        private final int area;

        public Africa(int area) {
            this.area = area;
            System.out.println("Africa: " + area);
        }
    }

    public class Antarctica {
        private final int area;

        public Antarctica(int area) {
            this.area = area;
            System.out.println("Antarctica: " + area);
        }
    }

    public class Australia {
        private final int area;

        public Australia(int area) {
            this.area = area;
            System.out.println("Australia: " + area);
        }
    }

    public class Eurasia {
        private final int area;

        public Eurasia(int area) {
            this.area = area;
            System.out.println("Eurasia: " + area);
        }
    }

    public class NorthAmerica {
        private final int area;

        public NorthAmerica(int area) {
            this.area = area;
            System.out.println("NorthAmerica: " + area);
        }
    }

    public class SouthAmerica {
        private final int area;

        public SouthAmerica(int area) {
            this.area = area;
            System.out.println("SouthAmerica: " + area);
        }
    }

    public class Earth {
        public void main(String[] args) {
            new Africa(30_370_000);
            new Antarctica(14_200_000);
            new Australia(8_600_000);
            new Eurasia(55_000_000);
            new NorthAmerica(24_709_000);
            new SouthAmerica(17_840_000);
        }
    }
}

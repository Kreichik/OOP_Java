package Assigment1.Assigment_1_2;

//public class Task11 {
//    public static void main(String[] args) {
//        int n = 0;
//        for (int i=0; i<=7; i++){
//            for (int j=0; j<=n; j++){
//
//                System.out.print("8");
//            }
//            n++;
//            System.out.println();
//
//        }
//    }
//}

public class Task11 {
    public static void main(String[] args) {
        int n = 0;
        int l = 0;
        for (int i=0; i<=20; i++){

            int k=0;
            while (k<=20-l) {
                System.out.print(" ");
                k++;
            }
            for (int j=0; j<=n; j++) {
                System.out.print("8");

            }
            n=n+2;
            l++;
            System.out.println();
        }




        n=38;
        l=2;
        for (int i=0; i<=19; i++){
            int k=0;
            while (k<=3-l) {
                System.out.print(" ");
                k++;
            }
            for (int j=0; j<=n; j++) {
                System.out.print("8");
            }
            n=n-2;
            l--;
            System.out.println();
        }
    }
}

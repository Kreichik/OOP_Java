package Assigment1.Assigment_1_1.Assigment1.Assigment_1_2;

public class Task8 {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        while (n<100){
            n++;
            if (n%3!=0){
                sum+=n;
            }
            else{
                continue;
            }


        }
        System.out.println(sum);
    }
}

package Assignment3.Assignment_3_2;

public class Task8 {
    public static void main(String[] args) {
        String s1 = new String("JavaITU");
        s1 = "JavaENU";
        String s2 = "JavaENU";
        String s3 = new String("JavaAITU");
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}

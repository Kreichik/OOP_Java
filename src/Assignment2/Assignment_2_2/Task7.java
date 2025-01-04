package Assignment2.Assignment_2_2;

public class Task7 {
    public static void main(String[] args) {
        signIn("user");
    }
    public static void signIn(String username){
        if(username.equals("user")){
            return;
        }
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}

import java.util.Scanner;
public class LOGIN_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username to sign up ");
        String username = input.nextLine();
        boolean bool = true;
        while (bool) {
            System.out.println("Enter password to sign up");
            String password = input.nextLine();
            if (password.contains("@") && password.length() >= 8) {
                System.out.println("To login, type 'Login'");
                String function = input.nextLine();
                if (function.equalsIgnoreCase("login")) {
                    System.out.println("Enter username");
                    String user_name = input.nextLine();
                    System.out.println("Enter password");
                    String pass_word = input.nextLine();
                    if (username.equals(user_name) && password.equals(pass_word)) {
                        System.out.println("Welcome");
                        bool = false;
                    } else {
                        System.out.println("Invalid username or password");
                    }
                }
            } else {
                System.out.println("Try again, Password must contain at least 8 characters and special characters '@'.");
            }
        }
    }
}
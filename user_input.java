import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner MainInput = null;
        try {
            MainInput = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = MainInput.next();
            System.out.println("Your name is: " + name);
        }
        finally {
            MainInput.close();
        }
    }
}

import java.util.Scanner;

public class While_Scanner {
    public static void main(String[] args) {
        // This was done using the while loop. 
        /*
        Scanner userInput = null;
        int correctAnswer = 5;
        try {
            userInput = new Scanner(System.in);
            System.out.println("Enter a number from 1 - 10: ");
            int temp = userInput.nextInt();
            while(temp != correctAnswer) {
                System.out.println("Wrong Answer.\nTry Again: ");
                temp = userInput.nextInt();
            }
            System.out.println("You got it.");
        }
        finally {
            userInput.close();
        }
        */

        //Doing the same using the Do-While loop.
        Scanner userInput = null;
        int temp;
        try {
            do {
                userInput = new Scanner(System.in);
                System.out.println("Enter a number from 1 -10:");
                temp = userInput.nextInt();
            } while(temp != 5);
        }
        finally {
            userInput.close();
        }
    }
}
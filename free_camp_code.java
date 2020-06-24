import java.util.Scanner;

public class free_camp_code 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to our mini game!\nWhat is your name?");
		Scanner myScanner = new Scanner(System.in);
		try 
		{
			String myName = myScanner.nextLine();
			System.out.println("Hello " + myName + ".\nEnter a number in range 1-10:");
			int myNumber = 0;
			int myGuess = (int) Math.floor(Math.random() * 10);
			int myLife = 5;
			while (myNumber != myGuess)
			{
				if (myLife == 0)
				{
					System.out.println("Game Over");
					break;
				}
				myNumber = myScanner.nextInt();
				if (myNumber < myGuess)
				{
					System.out.println("Low number!\nEnter a number:");
					myLife--;
				}
				else if (myNumber > myGuess)
				{
					System.out.println("High number!\nEnter a number:");
					myLife--;
				}
				else if (myNumber == myGuess)
				{
					System.out.println("Correct!");
					break;
				}
			}
		}
		finally 
		{
			myScanner.close();
		}
	}

}

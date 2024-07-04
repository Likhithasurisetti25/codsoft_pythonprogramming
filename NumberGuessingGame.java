import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
private static final int MAX_ATTEMPTS = 10;
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
Random random = new Random();
boolean playAgain = true;
while (playAgain)
{
int numberToGuess = random.nextInt(100) + 1;
int attempts = 0;
boolean hasGuessedCorrectly = false;
System.out.println("I have generated a number between 1 and 100. Try to guess it!");
while (attempts < MAX_ATTEMPTS && !hasGuessedCorrectly)
 {
 System.out.print("Enter your guess: ");
 int userGuess = scanner.nextInt();
 attempts++;
if (userGuess == numberToGuess) 
{
 hasGuessedCorrectly = true;
 System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
 } 
 else if (userGuess < numberToGuess)
{
System.out.println("Your guess is too low.");
}
 else 
{
System.out.println("Your guess is too high.");
}
}
if (!hasGuessedCorrectly)
{
System.out.println("You've used all your attempts. The correct number was " + numberToGuess + ".");
}
System.out.print("Do you want to play again? (yes/no): ");
playAgain = scanner.next().equalsIgnoreCase("yes");
}
System.out.println("Thank you for playing! Goodbye!");
scanner.close();
}
}
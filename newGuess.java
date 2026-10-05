import java.util.Random;
import java.util.Scanner;

public class newGuess {

    public static void main(String[] args) {
        
       Random random = new Random();
       int number = random.nextInt(100) + 1;
   
       Scanner in = new Scanner(System.in);
       System.out.println("I'm thinking of a number between 1 and 100 (including both)");
       System.out.println("Can you guess what it is?");
       
       int attempts = 0;
       int maxAttempts = 3;
       
       while (attempts < maxAttempts) {
		   System.out.print("Type a number: ");
		   int guess = scanner.nextInt();
		   attempts++;
		   
		   int difference = Math.abs(guess - number);
		   System.out.println("Your guess is: " + guess);
		   System.out.println("You were off by: " + difference);
		   
		   if (guess == number) {
			   System.out.println("Congratulations! You guessed the correct number !");
			   scanner.close();
			   return;
			  } else if (guess < number) {
				  System.out.println("Too low!");
				 } else {
					 System.out.println("Too high!");
				 }
				 
			System.out.println();
		}
	}
}	 


    }
}

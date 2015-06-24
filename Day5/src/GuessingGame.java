import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		//Create an instance of Scanner
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		int randomInt, guess, count;
		
		while(choice.equalsIgnoreCase("y")){
			//Pick a random number
			randomInt =(int) ((Math.random() * 100) + 1);
			//System.out.println(randomInt);
			//Print header and prompt
			System.out.println("Welcome to the Guessing Number Game");
			System.out.println("++++++++++++++++++++++++++++++++++++");
			System.out.println("I'm thinking of a number between 1 and 100");
			//Make sure user enters an integer between 1 and 100
			guess = Validator.getIntInRange(sc, "Enter a guess: ", 1, 100);
			//set count variable to 1
			count = 1;
			//Call the compare method to compare the guess and random number if guess is wrong
			while(guess != randomInt){
				count ++;
				compare(guess, randomInt);
				guess = Validator.getIntInRange(sc, "Guess Again: ", 1, 100);				
			}
			//Print the success message and number of tries it took
			//Ask if the user wants to play again
			System.out.printf("Great you guessed right. It took you %d tries.",count);
			choice = Validator.getChoice(sc,"Do you want to play again? y/n: ");
		}
		sc.close();
		System.out.println("Thank you for playing :)");
	}
	//Helper method compares the guess to the number
	//Prints specific message based on the difference between the two numbers
	public static void compare(int guess, int number){
		if(guess <= number-10){
			System.out.println("Way too low");
		}else if(guess >= number + 10){
			System.out.println("Way too high");
		}else if((guess < number + 10) && (guess > number)){
			System.out.println("High but getting closer");
		}else if((guess > number - 10) && (guess < number)){
			System.out.println("Low but getting closer");
		}
	}

}

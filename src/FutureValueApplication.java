import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FutureValueApplication {

	public static void main(String[] args) {
		//Print header
		System.out.println("Welcome to the Future Value Calculator\n");
		//create an instance of Scanner
		Scanner sc = new Scanner(System.in);
		//Set choice value to "y" so the while loop runs at least once
		String choice = "y";
		while(choice.equalsIgnoreCase("y")){
			//declare and initialize variables for monthly investment and rate of interest
			double monthlyInvestment = 0.0;
			double interestRate = 0.0;
			int years = 0;
			//Accept user input inside a try catch block
			try{
				System.out.print("Enter a monthly investment: ");
				monthlyInvestment = sc.nextDouble();
				System.out.print("Enter yearly Interest Rate: ");
				interestRate = sc.nextDouble();
				System.out.print("Enter number of years: ");
				years = sc.nextInt();
			}catch(InputMismatchException e){
				sc.next();
				System.out.println("Error! Invalid number. Try Again\n");
				continue;
			}
			//calculate and store monthly interest rate from annual interest rate
			//calculate number of months from years given
			//call static method "calculateFutureValue" and pass in amount, rate and months
			double monthlyInterestRate = interestRate/12/100;
			int months = years*12;
			double futureValue  = calculateFutureValue(monthlyInvestment,monthlyInterestRate,months);
			//use NumberFormat class to format output
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			System.out.println("Future Value: "+currency.format(futureValue)+"\n");
			//Prompt if user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}

	private static double calculateFutureValue(double monthlyInvestment,
			double monthlyInterestRate, int months) {
		double futureValue = 0;
		for(int i = 1; i <=months; i++){
			futureValue
		}
	}

}

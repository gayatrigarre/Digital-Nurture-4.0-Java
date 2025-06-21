package financialforecasting;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Present Value: ");
	        double presentValue = scanner.nextDouble();
	        System.out.print("Enter Annual Growth Rate (in %): ");
	        double rate = scanner.nextDouble();
	        double growthRate = rate / 100.0;
	        System.out.print("Enter Number of Years: ");
	        int years = scanner.nextInt();
	        double futureValue = Financialforcast.calculateFutureValue(presentValue, growthRate, years);
	        System.out.printf("Predicted Future Value after %d years: %.2f\n", years, futureValue);
	        scanner.close();
	    }
}

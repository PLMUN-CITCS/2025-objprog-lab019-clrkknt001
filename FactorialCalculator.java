package OOB;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		int n = getIntegerInput();
        int factorial = calculateFactorial(n);
        System.out.println("The factorial of " + n + " is: " + factorial);
	}
	static int getIntegerInput() {
		Scanner s = new Scanner(System.in);
		int number = 0;
		while (true) {
                System.out.print("Enter a non-negative integer: ");
                number = s.nextInt();
                if (number >= 0) {
                    return number;
                } else {
                    System.out.println("Error: Please enter a non-negative integer.");
                }
            }
		}
	
	static int calculateFactorial(int n	) {
		 int factorial = 1;
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }
	        return factorial;
	}
	
	}



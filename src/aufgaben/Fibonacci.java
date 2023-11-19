package aufgaben;
import java.util.Scanner;

public class Fibonacci {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter Fibonacci number sequence: ");
		int num = input.nextInt();
		System.out.println(fibonacciRekursiv(num));
		System.out.println(fibonacciIterativ(num));
		System.out.println(fibonacciFormel(num));
	}

	public static long fibonacciRekursiv(int index) {
		if (index <= 1) {
			return index;
		}
		else {
			return fibonacciRekursiv(index - 1) + fibonacciRekursiv(index - 2);
		}
	}
	
	public static long fibonacciIterativ(int index) {
		int prev1 = 0;
		int prev2 = 1;
		int fib_int = 0;
		if (index <= 1) {
			return index;
		}
		else {
			for (int step = 2; step <= index; step++) {
				fib_int = prev1 + prev2;
				prev1 = prev2;
				prev2 = fib_int;
			}
			
			return fib_int;
		}
	}
	
	public static long fibonacciFormel(int index) {
		double fib = (1/Math.sqrt(5)) * ( Math.pow(((1+Math.sqrt(5)) / 2),index) - Math.pow(((1-Math.sqrt(5)) / 2),index));
		return (long) fib;
	}
}

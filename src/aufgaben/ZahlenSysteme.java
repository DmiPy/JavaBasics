package aufgaben;
import java.util.Scanner;

public class ZahlenSysteme {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
			System.out.println("Enter the number in decimal system: ");
			int decimal = input.nextInt();
			System.out.println("Enter in what system number you want to see your decimal: ");
			int numSystem = input.nextInt();
			int integer = fromDecimalTo(decimal, numSystem);
			System.out.println(integer);
			System.out.println("-------------------------");
			System.out.println(fromTo(101,2,8));
	}
	
	public static int fromDecimalTo(int decimal, int numSystem) {
		StringBuilder remainder = new StringBuilder();
		while (decimal != 0) {
			remainder.append(decimal % numSystem);
			decimal /= numSystem;
		}
		String str = remainder.reverse().toString();
		
		return Integer.parseInt(str);
	}
	
	public static int fromTo(int number, int currentSystem, int intGoalSystem) {
		String strNumber = String.valueOf(number);
		int len = strNumber.length();
		int decimalSum = 0;
		for(int i = 0; i <= len - 1; i++) {
			int num = Character.getNumericValue(strNumber.charAt(i));
			decimalSum += (num * Math.pow(currentSystem,len-i-1));
			System.out.println(num + " * "+ currentSystem + "**" + (len - i) +" = " + decimalSum);
			
		}
		return fromDecimalTo(decimalSum,intGoalSystem);
		
	}

}
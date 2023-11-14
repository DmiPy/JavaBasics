package aufgaben;
import java.util.HashMap;
import java.util.Scanner;

public class Seriennummer {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// alphabet is not used here, but good to see how letter++ functions
		char[] alphabet = new char[26];
		char letter = 'A';
		int sum = 0;
		for (int i = 0; i < 26; i++) {

		    alphabet[i] = letter++;
		} 
	
		
		System.out.println("Enter your serial number. For Example: SB2420931622");
		String number = scan.nextLine();
		
		boolean ifLetters = Character.isLetter(number.charAt(0)) && Character.isLetter(number.charAt(1));
		if (ifLetters && number.length() == 12) {
			for(int i = 0; i < number.length(); i++) {
				char c = number.charAt(i);
				if (Character.isLetter(c)) {
					int value = Character.toUpperCase(c) - 'A' + 1;
					sum += value;
				}
				else {
					int value = Character.getNumericValue(c);
					sum += value;
				}
			}
			
			// Variable 'sum' accumulates the numerical values of the letters and digits
			// in the serial number to determine its validity based on the remainder
			// when divided by 9.
			int remainder = sum % 9; 
			

            if (remainder == 7) {
                System.out.println("The remainder is 7. The serial number is correct.");
            } else {
                System.out.println("The remainder is not 7. The serial number is incorrect.");
            }
		}
		else {
			System.out.println("Invalid serial number format or length.");
		}

	}

}

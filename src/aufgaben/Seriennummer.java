package aufgaben;
import java.util.HashMap;
import java.util.Scanner;

public class Seriennummer {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] integers = new int[26];
		char[] alphabet = new char[26];
		char letter = 'A';
		for (int i = 0; i < 26; i++) {
			integers[i] = i+1;
		    alphabet[i] = letter++;
		}
		int sum = 0;
		String number = new String();
		System.out.println("Enter your serial number. For Example: SB2420931622");
		number = scan.nextLine();
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
			int remainder = sum % 9;
            if (remainder == 7) {
                System.out.println("The remainder is 7. The serial number is correct.");
            } else {
                System.out.println("The remainder is not 7. The serial number is incorrect.");
            }
			
		}
		else {
			System.out.println("Invalid serial number format or length");
		}

	}

}

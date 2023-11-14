package aufgaben;
import java.util.Scanner;

public class Schleifen {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String command;
		System.out.println("Choose one from the commands!");
		command = scan.nextLine().toUpperCase();
		switch (command) {
			case "P":
				palindrome();
				break;
			case "V":
				vowels();
				break;
			case "R":
				rhombus();
				break;
			case "B":
				binary();
				break;
			default:
				System.out.println("Wrong match");
		}
	}
	
	public static void palindrome() {
		String word;
		Boolean ifPalindrome = true;
		System.out.println("Enter the word, to check if it is a palindrome");
		
		word = scan.nextLine().toLowerCase();
		for( int i = 0; i < word.length()/2; i++) {
			if (word.charAt(i) != word.charAt(word.length()-i-1)) {
				ifPalindrome = false;
				break;
			}
		}
		String response = ifPalindrome ? "Your word " + word + " is palindrome" : "Your word " + word + " is not palindrome";
		System.out.println(response);
		
	}
	
	public static void vowels() {
        System.out.println("Enter the word to count vowels, consonants, and remaining characters:");
        String word = scan.nextLine().toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;
        int otherCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                        currentChar == 'o' || currentChar == 'u'|| currentChar == 'y') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else {
                otherCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of other characters: " + otherCount);
    }
	
	public static void rhombus() {
		System.out.println("Enter the length of Rhombus (only odd value)");
		int len = scan.nextInt();
		if (len % 2 != 0) {
			for(int line = 0; line <= len; line++) {
				int spaceNumber = Math.abs(len - 1 - line * 2);
				int spacesOnOneSide = spaceNumber / 2;


	            for (int i = 0; i < spacesOnOneSide; i++) {
	                System.out.print(" ");
	            }

	            for (int i = 0; i < len - spaceNumber; i++) {
	                System.out.print("#");
	            }

	            for (int i = 0; i < spacesOnOneSide; i++) {
	                System.out.print(" ");
	            }

	            System.out.println();
			}
		}
		else {
			System.out.println("Wrong value, try again.");
			rhombus();
		}
			
	}
	
	public static void binary() {
	    System.out.println("Enter the number you want to see in binary system:");
	    int number = scan.nextInt();

	    StringBuilder reversedBinary = new StringBuilder();
	    
	    while (number != 0) {
	        int remainder = number % 2;
	        reversedBinary.append(remainder);
	        number /= 2;
	    }

	    System.out.println("Binary representation: " + reversedBinary.reverse());
	}

}

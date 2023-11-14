package aufgaben;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
        
        System.out.println("What function do you want to use? (A / D)");
        String choice = scan.nextLine();

        switch (choice) {
            case "A":
                createArray();
                break;
            case "D":
                rollDice();
                break;
            default:
                System.out.println("Wrong option!");
        }
        
    }

    public static void createArray() {
    	System.out.println("How much numbers do you want to enter?");
    	int len = scan.nextInt();
    	int[] numbers = new int[len];
    	int i = 0;
    	while( i < len) {
    		System.out.println("Enter the " + (i + 1) + " number.");
    		System.out.println(Arrays.toString(numbers));
    		int num = scan.nextInt();
    		numbers[i] = num;
    		i++;
    	}
    	
    	System.out.println("Your array is " + Arrays.toString(numbers));
    }

    public static void rollDice() {
        int[] diceCounts = new int[6]; 

        int totalRolls = 0;
        while (totalRolls < 1000000) {
            int result = (int) (Math.random() * 6) + 1; 
            diceCounts[result - 1]++; 
            totalRolls++;
        }


        System.out.println("Results after a million rolls:");
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + ": " + diceCounts[i]);
        }
    }


}

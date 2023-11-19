package aufgaben;
import java.util.Scanner;

public class Treppen {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter the length of stairs:");
		int len = input.nextInt();
		System.out.println(treppenLaufen(len));
		
	}
	
	public static int treppenLaufen(int len) {
		if (len == 0) {
			return 1;
		}
		else if (len == 1){
			return 1;
		}
		else if(len == 2) {
			return 2;
		}
		else {
			int[] dp = new int[len+1];
			dp[0] = 0;
			dp[1] = 1;
			dp[2] = 2;
			
			for (int i = 3; i <= len; i++) {
				dp[i] = dp[i - 1] + dp[i - 2];
			}
			return dp[len];
		}
	}
	
	public static int treppenRennen(int len, int stepSize) {
		return 0;
		
	}

}

package aufgaben;
import java.util.Scanner;

public class Sieb {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
        System.out.println("How long must be set of natural numbers ?");
        int n = scan.nextInt();
        int[] primNums = new int[n];
        int startNum = 2;
        boolean[] primNumsBool = new boolean[n];
        
        for (int i = 0; i < primNumsBool.length; i++) {
            primNumsBool[i] = true;
            primNums[i] = startNum + i;
        }
        
        for(int i = 0; i < primNumsBool.length; i++) {
            int currentNumber = primNums[i];
            for(int j = 0; j < primNumsBool.length; j++) {
                if (j != i && primNums[j] % currentNumber == 0) {
                    primNumsBool[j] = false;
                }
            }
        }

        System.out.println("Prime numbers:");
        for (int i = 0; i < primNumsBool.length; i++) {
            if (primNumsBool[i]) {
                System.out.print(primNums[i] + " ");
            }
        }
    }

}

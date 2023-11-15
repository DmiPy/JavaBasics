package aufgaben;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {

	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = newArray();
		showArray(arr);
		mixArray(arr);
		showArray(arr);

	}
	
	
	public static int[] newArray() {
		System.out.println("How long should be your array?");
		int len = scan.nextInt();
		int[] array = new int[len];
		int i = 0;
		while (i < len) {
			System.out.println("What is your " + (i+1) + " element of array?");
			int element = scan.nextInt();
			array[i] = element;
			i++;
		}
		return array;
	}
	
	public static void showArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void mixArray(int[] array) {
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			int index = random.nextInt(array.length);
			int temp = array[index];
			array[index] = array[i];
			array[i] = temp;
			
		}

	}

}

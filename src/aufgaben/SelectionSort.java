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
		selectionSort(arr);
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
	public static void selectionSort(int[] array) {
		int index = 0;
		while (index != array.length - 1) {
			int current_element = array[index];
			int lowest_value = Integer.MAX_VALUE;
			int lowest_value_id = Integer.MAX_VALUE;
			for (int inner_index = index; inner_index < array.length; inner_index++) {
				if (array[inner_index] < lowest_value) {
					lowest_value = array[inner_index];
					lowest_value_id = inner_index;
				}
			}
			
			int temp_variable = lowest_value;
			array[lowest_value_id] = current_element;
			array[index] = temp_variable;
			
			
			index++;
		}
		
	}

}

package aufgaben;
import java.util.Scanner;

public class Binomial {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter n: ");
		int n = input.nextInt();
		System.out.print("Enter k: ");
		int k = input.nextInt();
		System.out.println(fakultaet(n));
		System.out.println(binomialFakultaet(n, k));
		System.out.println(binomialProduktQuotient(n, k));
		System.out.println(binomialAlternierend(n, k));
		System.out.println(binomialRekursiv(n,k));
	}
	
	public static long fakultaet(int n) {
		if (n <= 1) {
			return 1;
		}
		else {
			return n * fakultaet(n-1);
		}
	}
	
	public static long binomialFakultaet(int n, int k) {
		long binom = fakultaet(n) / (fakultaet(k) * fakultaet(n-k));
		return binom;
	}
	
	public static int binomialProduktQuotient(int n, int k) {
		int n_prod = 1;
		int k_prod = 1;
		for(int i = 0; i < k; i++) {
			n_prod *= (n - i);
			k_prod *= (i + 1);
		}
		return n_prod / k_prod;
	}
	
	public static int binomialAlternierend(int n, int k) {
		double product = 1;
		for(int i = 0; i < k; i++) {
			product *= ((double)(n - i) / (i + 1));
		}
		return (int) product;
	}
	
	public static int binomialRekursiv(int n, int k) {
		if (k == 0 || k == n) {
			return 1;
		} else if( k > n ) {
			return 0;
		} else {
			return binomialRekursiv(n-1, k-1) + binomialRekursiv(n-1, k);
		}
		
	}
	

}

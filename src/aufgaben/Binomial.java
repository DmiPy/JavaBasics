package aufgaben;
import java.util.Scanner;

public class Binomial {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter k: ");
        int k = input.nextInt();
        System.out.println(factorial(n));
        System.out.println(binomialCoefficient(n, k));
        System.out.println(binomialProductQuotient(n, k));
        System.out.println(binomialAlternating(n, k));
        System.out.println(binomialRecursive(n, k));
    }

    // Calculates factorial of a given number 'n'
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Calculates binomial coefficient (n choose k)
    public static long binomialCoefficient(int n, int k) {
        long binom = factorial(n) / (factorial(k) * factorial(n - k));
        return binom;
    }

    // Calculates binomial coefficient using product and quotient formula
    public static int binomialProductQuotient(int n, int k) {
        int n_prod = 1;
        int k_prod = 1;
        for (int i = 0; i < k; i++) {
            n_prod *= (n - i);
            k_prod *= (i + 1);
        }
        return n_prod / k_prod;
    }

    // Calculates binomial coefficient using alternating product formula
    public static int binomialAlternating(int n, int k) {
        double product = 1;
        for (int i = 0; i < k; i++) {
            product *= ((double) (n - i) / (i + 1));
        }
        return (int) product;
    }

    // Calculates binomial coefficient using recursive approach
    public static int binomialRecursive(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else if (k > n) {
            return 0;
        } else {
            return binomialRecursive(n - 1, k - 1) + binomialRecursive(n - 1, k);
        }
    }
}

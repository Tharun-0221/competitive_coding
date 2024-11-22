import java.util.Scanner;

public class EuclidsAlgorithm {

    // Recursive method to compute GCD
    public static int gcd(int a, int b) {
        // Base case: if b is 0, return a
        if (b == 0) {
            return a;
        }
        // Recursive case: call gcd with b and a % b
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: take two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate and print the GCD
        int result = gcd(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}

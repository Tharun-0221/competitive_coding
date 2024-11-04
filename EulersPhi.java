public class EulersPhi {

    // Function to calculate Euler's Totient function
    public static int eulerTotient(int n) {
        int result = n;  // Initialize result as n
        for (int p = 2; p * p <= n; p++) {
            // Check if p is a divisor of n
            if (n % p == 0) {
                // If it is, then it's a prime factor, subtract multiples of p
                while (n % p == 0) {
                    n /= p;
                }
                result -= result / p; // Applying the formula
            }
        }
        // If n has a prime factor greater than sqrt(n)
        if (n > 1) {
            result -= result / n; // Apply the formula for this prime factor
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 36; // Example number
        System.out.println("Euler's Totient φ(" + n + ") = " + eulerTotient(n));
    }
}

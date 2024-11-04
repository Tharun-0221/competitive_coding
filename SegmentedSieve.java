import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SegmentedSieve {

    // Function to perform the Sieve of Eratosthenes
    private static List<Integer> simpleSieve(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        List<Integer> primes = new ArrayList<>();

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int p = 2; p <= limit; p++) {
            if (isPrime[p]) {
                primes.add(p);
            }
        }
        return primes;
    }

    // Function to find primes in a range using the Segmented Sieve
    public static List<Integer> segmentedSieve(int low, int high) {
        int limit = (int) Math.sqrt(high) + 1;
        List<Integer> primes = simpleSieve(limit);

        boolean[] isPrime = new boolean[high - low + 1];
        Arrays.fill(isPrime, true);

        for (int p : primes) {
            // Find the minimum number in the [low, high] range that is a multiple of p
            int start = Math.max(p * p, low + (p - low % p) % p);

            for (int j = start; j <= high; j += p) {
                isPrime[j - low] = false;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            if (isPrime[i - low] && i > 1) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int low = 10;
        int high = 50;
        List<Integer> primes = segmentedSieve(low, high);
        System.out.println("Primes in range [" + low + ", " + high + "]: " + primes);
    }
}

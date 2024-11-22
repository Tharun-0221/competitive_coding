import java.util.Scanner;

public class BinaryPalindrome {

    // Method to check if the binary representation of a number is a palindrome
    public static boolean isBinaryPalindrome(int number) {
        // Convert the number to binary string
        String binaryString = Integer.toBinaryString(number);
        
        // Reverse the binary string
        String reversedBinaryString = new StringBuilder(binaryString).reverse().toString();
        
        // Check if the binary string is equal to its reverse
        return binaryString.equals(reversedBinaryString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the binary representation is a palindrome
        if (isBinaryPalindrome(number)) {
            System.out.println("The binary representation of " + number + " is a palindrome.");
        } else {
            System.out.println("The binary representation of " + number + " is not a palindrome.");
        }

        scanner.close();
    }
}

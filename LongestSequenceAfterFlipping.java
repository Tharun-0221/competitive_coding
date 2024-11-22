public class LongestSequenceAfterFlipping {
    
    // Method to find the longest sequence of 1s after flipping one bit
    public static int findLongestSequence(int num) {
        int prevCount = 0;  // Length of previous sequence of 1's
        int currCount = 0;  // Length of current sequence of 1's
        int maxCount = 0;   // Maximum length of sequence of 1's found
        
        while (num != 0) {
            // If the current bit is 1, increase the current sequence count
            if ((num & 1) == 1) {
                currCount++;
            } else {
                // If the current bit is 0, check the total length by flipping this 0
                prevCount = currCount;
                currCount = 0;
            }
            
            // The longest sequence found so far is either the current sequence or the previous + current (after flip)
            maxCount = Math.max(maxCount, prevCount + currCount + 1);
            
            // Right shift the number to check the next bit
            num >>= 1;
        }
        
        return maxCount;
    }

    public static void main(String[] args) {
        int num = 1775; // Example number in decimal (11011101111 in binary)
        
        // Call the method and print the result
        int result = findLongestSequence(num);
        System.out.println("Longest sequence of 1's after flipping one bit: " + result);
    }
}

public class BlockSwap {

    // Utility function to swap two blocks in the array
    public static void swapBlocks(int[] arr, int start1, int start2, int size) {
        for (int i = 0; i < size; i++) {
            int temp = arr[start1 + i];
            arr[start1 + i] = arr[start2 + i];
            arr[start2 + i] = temp;
        }
    }

    // Function to rotate the array by k positions
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // In case k is greater than n, reduce it to within bounds

        // Base case: If k is 0 or k == n, no rotation is needed
        if (k == 0 || k == n) {
            return;
        }

        // If k and n-k are different, recursively swap the blocks
        if (k < n - k) {
            swapBlocks(arr, 0, n - k, k);
            rotateArray(arr, k); // Rotate the remaining part
        } else {
            swapBlocks(arr, 0, k, n - k);
            rotateArray(arr, n - k); // Rotate the remaining part
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};  // Example array
        int k = 3;  // Number of positions to rotate
        
        System.out.println("Original array:");
        printArray(arr);

        // Rotate array using block swap algorithm
        rotateArray(arr, k);

        System.out.println("Array after rotating by " + k + " positions:");
        printArray(arr);
    }
}

import java.util.*;

public class LeadersInArray {
    
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        
        // Start with the rightmost element
        int maxRight = arr[arr.length - 1];
        
        // The rightmost element is always a leader
        leaders.add(maxRight);
        
        // Traverse the array from right to left
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                // If the current element is greater than or equal to the max element on its right
                leaders.add(arr[i]);
                maxRight = arr[i];  // Update the maxRight value
            }
        }
        
        // Reverse the leaders list because we have added elements from right to left
        Collections.reverse(leaders);
        
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        
        List<Integer> leaders = findLeaders(arr);
        
        System.out.println("Leaders in the array: " + leaders);
    }
}

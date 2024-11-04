import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNumber {

    public static boolean isStrobogrammatic(String num) {
        // Map of strobogrammatic pairs
        Map<Character, Character> strobogrammaticMap = new HashMap<>();
        strobogrammaticMap.put('0', '0');
        strobogrammaticMap.put('1', '1');
        strobogrammaticMap.put('6', '9');
        strobogrammaticMap.put('8', '8');
        strobogrammaticMap.put('9', '6');

        StringBuilder rotatedNum = new StringBuilder();

        // Rotate the number
        for (int i = num.length() - 1; i >= 0; i--) {
            char digit = num.charAt(i);
            // If the digit is not strobogrammatic, return false
            if (!strobogrammaticMap.containsKey(digit)) {
                return false;
            }
            // Append the corresponding rotated digit
            rotatedNum.append(strobogrammaticMap.get(digit));
        }

        // Check if the rotated number matches the original number
        return rotatedNum.toString().equals(num);
    }

    public static void main(String[] args) {
        String[] testNumbers = {"69", "88", "818", "609", "123", "962"};
        for (String num : testNumbers) {
            System.out.println(num + " is strobogrammatic: " + isStrobogrammatic(num));
        }
    }
}

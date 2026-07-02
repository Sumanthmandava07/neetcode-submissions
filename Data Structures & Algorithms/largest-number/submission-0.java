public class Solution {

    public String largestNumber(int[] nums) {

        // Step 1: Create a String array of the same size
        String[] arr = new String[nums.length];

        // Step 2: Convert each integer into a String
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Step 3: Sort the array using a custom comparison
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                // Compare two possible combinations
                String option1 = arr[i] + arr[j];
                String option2 = arr[j] + arr[i];

                // If option2 is larger, swap them
                if (option2.compareTo(option1) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Step 4: Join all strings together
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }

        // Step 5: Handle cases like [0,0]
        if (result.charAt(0) == '0') {
            return "0";
        }

        return result;
    }
}
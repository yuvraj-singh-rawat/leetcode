class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;  // Update the smallest value
            } else if (num <= second) {
                second = num;  // Update the second smallest value
            } else {
                // Found a number larger than both first and second
                return true;
            }
        }
        return false;
    }
}
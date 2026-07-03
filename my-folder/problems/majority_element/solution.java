class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = -1;

        // Phase 1: find the element
        for (int i : nums) {
            if (count == 0) {
                element = i;
                count = 1;
            } else if (i == element) {
                count++;
            } else {
                count--;
            }
        }

        // Phase 2: checking if the stored element is actually appears more than N/2 times
        int counter = 0;
        for (int i : nums) {
            if (i == element) {
                counter++;
            }
        }

        if (counter > (n / 2)) {
            return element;
        } else {
            return -1;
        }
    }
}
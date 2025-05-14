class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = -1;

        for (int i: nums) {
            if (count == 0) {
                element = i;
                count = 1;
            } else if (i == element) {
                count++;
            } else {
                count--;
            }
        }

        int counter = 0;
        for (int i : nums) {
            if (i == element) {
                counter++;
            }
        }

        if (counter > (n/2)) {
            return element;
        } else {
            return -1;
        }
    }
}
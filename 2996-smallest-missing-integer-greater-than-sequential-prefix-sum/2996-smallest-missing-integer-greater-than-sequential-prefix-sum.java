class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = nums[0];

        // Find longest sequential prefix
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Find smallest missing number >= sum
        for (int it : nums) {
            set.add(it);
        }

        int count = sum;

        while (set.contains(count)) {
            count++;
        }

        return count++;
    }
}
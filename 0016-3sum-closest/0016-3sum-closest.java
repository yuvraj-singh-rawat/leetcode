class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            // Pruning 1: Smallest possible sum for current 'i'
            int minSum = nums[i] + nums[left] + nums[left + 1];
            if (minSum > target) {
                if (Math.abs(minSum - target) < Math.abs(closest - target)) {
                    closest = minSum;
                }
                break;
            }

            // Pruning 2: Largest possible sum for current 'i'
            int maxSum = nums[i] + nums[right - 1] + nums[right];
            if (maxSum < target) {
                if (Math.abs(maxSum - target) < Math.abs(closest - target)) {
                    closest = maxSum;
                }
                continue;
            }

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    return sum;
                }

                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closest;
    }
}
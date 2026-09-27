class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        long totalSum = 0;
        
        int low = 1;
        int high = 0;

        for (int num : nums) {
            totalSum += num;
            high = Math.max(high, num);
        }

        if (threshold >= totalSum) {
            return 1;
        }

        if (threshold == nums.length) {
            return high;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isSumSmallEnough(nums, mid, threshold)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean isSumSmallEnough(int[] nums, int divisor, int threshold) {
        int total = 0;

        for (int num : nums) {
            total += (num + divisor - 1) / divisor;
            if (total > threshold) {
                return false;
            }
        }
        return total <= threshold;
    }
}
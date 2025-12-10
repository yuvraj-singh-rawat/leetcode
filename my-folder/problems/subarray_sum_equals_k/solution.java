class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSums = new HashMap<>();

        int res = 0;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            if (currSum == k) res++;

            if (prefixSums.containsKey(currSum - k)) {
                res += prefixSums.get(currSum - k);
            }

            prefixSums.put(currSum, prefixSums.getOrDefault(currSum, 0) + 1);
        }

        return res;
    }
}
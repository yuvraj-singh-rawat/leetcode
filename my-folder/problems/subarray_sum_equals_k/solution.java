class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixFrequency = new HashMap<>();

        prefixFrequency.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            int requiredPrefix = prefixSum - k;

            if (prefixFrequency.containsKey(requiredPrefix)) {
                count += prefixFrequency.get(requiredPrefix);
            }

            prefixFrequency.put(prefixSum, prefixFrequency.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}
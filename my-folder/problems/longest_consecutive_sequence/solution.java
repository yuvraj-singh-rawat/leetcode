class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        Set<Integer> set = new HashSet<>();

        int maxLen = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int it : set) {
            if (!set.contains(it - 1)) {
                int currentNum = it;
                int count = 1;
                while(set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }
}
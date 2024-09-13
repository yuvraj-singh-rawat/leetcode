class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1) {
                return true;
            }
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}
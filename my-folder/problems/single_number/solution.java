class Solution {
    public int singleNumber(int[] nums) {
        // for (int i=0; i<nums.length; i++) {
        //     int num = nums[i];
        //     int cnt = 0;

        //     for (int j=0; j<nums.length; j++) {
        //         if (nums[j] == num)
        //         cnt++;
        //     }

        //     if (cnt == 1 ) return num;
        // }
        // return -1;


        // HashMap<Integer, Integer> mpp = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     int value = mpp.getOrDefault(nums[i], 0);
        //     mpp.put(nums[i], value + 1);
        // }
        // for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
        //     if (it.getValue() == 1) {
        //         return it.getKey();
        //     }
        // }
        // return -1;


        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
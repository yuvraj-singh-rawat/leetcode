class Solution {
    public void moveZeroes(int[] nums) {

        int j = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j+1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++; 
            }
        }


        // Brute Force Approach

        // ArrayList<Integer> temp = new ArrayList<>();

        // for(int i=0; i<nums.length; i++) {
        //     if (nums[i] != 0) {
        //         temp.add(nums[i]);
        //     }
        // }

        // int tempSize = temp.size();

        // for(int i=0; i <tempSize; i++) {
        //     nums[i] = temp.get(i);
        // }

        // for(int i=tempSize; i<nums.length; i++) {
        //     nums[i] = 0;
        // }
    }
}
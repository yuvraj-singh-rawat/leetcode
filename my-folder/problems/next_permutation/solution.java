class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int piv = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                piv = i;
                break;
            }
        }

        if (piv == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n-1; i > piv; i--) {
            if (nums[i] > nums[piv]) {
                swap(nums, i, piv);
                break;
            }
        }

        reverse(nums, piv + 1, n - 1);
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
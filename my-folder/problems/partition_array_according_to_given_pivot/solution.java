class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0, right = n - 1;

        int i = 0, j = n - 1;

        while (i < n) {
            if (nums[i] < pivot) {
                result[left++] = nums[i];
            }

            if (nums[j] > pivot) {
                result[right--] = nums[j];
            }

            i++;
            j--;
        }

        while (left <= right) {
            result[left++] = pivot;
        }

        return result;
    }
}
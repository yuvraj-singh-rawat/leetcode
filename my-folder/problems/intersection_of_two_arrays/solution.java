class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) { 
            return intersection(nums2, nums1); 
        }

        Arrays.sort(nums1);
        HashSet<Integer> result = new HashSet<>();

        for (int num : nums2) {
            if (binarySearch(nums1, num)) {
                result.add(num);
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) ans[i++] = num;
        return ans;
    }

    private boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        int ele1 = -1;
        int ele2 = -1;

        int count1 = 0;
        int count2 = 0;

        // 1st Pass: Find potential candidates
        for (int num : nums) {

            // Increment count for candidate 1
            if (num == ele1) {
                count1++;
            }

            // Increment count for candidate 2
            else if (num == ele2) {
                count2++;
            }

            // New candidate 1 if count is zero
            else if (count1 == 0) {
                ele1 = num;
                count1 = 1;
            }

            // New candidate 2 if count is zero
            else if (count2 == 0) {
                ele2 = num;
                count2 = 1;
            }

            // Decrease counts if neither candidate matches
            else {
                count1--;
                count2--;
            }
        }

        // 2nd Pass: Verify actual counts
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == ele1) {
                count1++;
            } else if (num == ele2) {
                count2++;
            }
        }

        // Prepare result list
        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) {
            result.add(ele1);
        }
        if (count2 > n / 3 && ele1 != ele2) {
            result.add(ele2);
        }

        return result;
    }
}
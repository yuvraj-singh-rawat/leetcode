class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Integer.MIN_VALUE;

        // finding max in piles
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > end) {
                end = piles[i];
            }
        }

        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (canEatInTime(piles, h, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static boolean canEatInTime(int[] piles, int h, int eatingSpeed) {
        int hourSpent = 0;
        for (int i = 0; i < piles.length; i++) {
            hourSpent += piles[i] / eatingSpeed;
            if (piles[i] % eatingSpeed != 0) {
                hourSpent += 1;
            }

            if (hourSpent > h) 
                return false;
        }
        return true;
    }
}
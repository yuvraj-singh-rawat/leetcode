class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        int result = -1;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long hours = getHours(piles, mid);

            if (hours <= h) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    private long getHours(int[] piles, int k) {
        long totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + k - 1L) / k;
        }
        return totalHours;
    }
}
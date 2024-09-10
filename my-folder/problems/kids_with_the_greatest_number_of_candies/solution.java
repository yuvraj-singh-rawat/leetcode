class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = findMax(candies);

        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
    return result;
    }

    static int findMax(int[] candies) {
        int max = candies[0];
        for(int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        return max;
    }
}
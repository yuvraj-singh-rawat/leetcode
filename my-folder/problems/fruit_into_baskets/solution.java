class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> count = new HashMap<>();
        int maxFruits = 0;

        int left = 0;
        int right = 0;

        for (right = 0; right < fruits.length; right++) {
            count.merge(fruits[right], 1, Integer::sum);

            while (count.size() > 2) {
                int leftFruit = fruits[left];
                count.put(leftFruit, count.get(leftFruit) - 1);
                if (count.get(leftFruit) == 0) {
                    count.remove(leftFruit);
                }
                left++;
            }
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        return maxFruits;    
    }
}
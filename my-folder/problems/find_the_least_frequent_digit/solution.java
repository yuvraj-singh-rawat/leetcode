class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] frequency = new int[10];

        while (n > 0) {
            int digits = n % 10;
            frequency[digits]++;
            n = n / 10;
        }

        int minimumFrequency = Integer.MAX_VALUE;
        int result = 0;
        for (int digits = 0; digits <= 9; digits++) {
            if (frequency[digits] > 0 && frequency[digits] < minimumFrequency) {
                minimumFrequency = frequency[digits];
                result = digits;
            }
        }
        return result;
    }
}
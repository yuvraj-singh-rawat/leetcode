class Solution {
    public int differenceOfSums(int n, int m) {
        int totalSum = n * (n+1) / 2;
        int countDivisible = n / m;
        int sumDivisible = m * countDivisible * (countDivisible + 1) / 2;

        return totalSum - 2 * sumDivisible;
    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // just add 1
                return digits; // done
            }
            digits[i] = 0; // if 9, make it 0 and carry forward
        }

        // If all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1; // like 999 -> 1000
        return result;
    }
}
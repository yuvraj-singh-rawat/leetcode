class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        int sign = 1;
        long result = 0;

        // 1. Skip Leading Spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // If we reached the end of the string, return 0
        if (i == n) {
            return 0;
        }

        // 2. Check sign
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // 3. Process digits and handle overflow
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            result = result * 10 + digit;

            // Positive overflow
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            // Negative overflow
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        // 5. Apply sign
        return (int) (result * sign);
    }
}
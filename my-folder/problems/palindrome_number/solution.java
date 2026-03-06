class Solution {
    public boolean isPalindrome(int x) {
        int lastDigit = 0, revNum = 0;
        int dup = x;
        while (x > 0) {
            lastDigit = x % 10;
            revNum = (revNum * 10) + lastDigit;
            x = x / 10;
        }
        return dup == revNum;
    }
}
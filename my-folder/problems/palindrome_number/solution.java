class Solution {
    public boolean isPalindrome(int x) {
        int rem = 0, rev = 0, temp = x;
        while (x > 0) {
            rem = x % 10;
            rev = (rev * 10) + rem;
            x = x / 10;
        }
        if (temp == rev) 
            return true;
        else 
            return false;
    }
}
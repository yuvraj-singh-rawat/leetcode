class Solution {
    public int reverse(int x) {
        int revNum = 0, lastDigit = 0;
        int n = Math.abs(x);
        while ( n > 0 )  {
            lastDigit = n % 10;
            if (revNum > (Integer.MAX_VALUE - lastDigit) / 10) {
                return 0;
            }

            revNum = ( revNum * 10 ) + lastDigit;
            n = n / 10;
        }
        return (x < 0) ? (-revNum) : revNum;
    }
}
class Solution {
    public String largestGoodInteger(String num) {
        for(int i = 9; i >= 0; i--) {
            String tripleDigit = String.valueOf(i).repeat(3);
            if (num.contains(tripleDigit)) {
                return tripleDigit;
            }
        }
        return "";
    }
}
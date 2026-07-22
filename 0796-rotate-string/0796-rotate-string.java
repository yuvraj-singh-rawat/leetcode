class Solution {
    public boolean rotateString(String s, String goal) {
        // Edge Case
        if (s.length() != goal.length())
            return false;

        // double the string
        String doubleS = s + s;

        // check if goal is in doubles
        return doubleS.contains(goal);
    }
}
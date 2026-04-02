class Solution {
    public boolean rotateString(String s, String goal) {
        // int n = s.length();

        // for (int i = 0; i < n; i++) {
        //     if (s.equals(goal)) return true;

        //     s = s.substring(1) + s.charAt(0);
        // }
        // return false;

        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);

    }
}
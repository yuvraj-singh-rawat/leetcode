class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        String text = s + s;
        String pattern = goal;
 
        int n = text.length();
        int m = pattern.length();

        int[] lps = computeLPS(pattern);

        int i = 0; 
        int j = 0; 

        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                j++;
                i++;
            }

            if (j == m) {
                return true;
            }
            else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }

        return false;
    }

    private int[] computeLPS(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];

        int len = 0;

        lps[0] = 0;

        int i = 1;

        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } 
            
            else {
                if (len != 0) {
                    len = lps[len - 1];
                }         
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        for (int ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int ch : t.toCharArray()) {
            freq[ch - 'a']--;
        }

        for (int val : freq) {
            if (val != 0) {
                return false;
            }
        }

        return true;

    }  
}
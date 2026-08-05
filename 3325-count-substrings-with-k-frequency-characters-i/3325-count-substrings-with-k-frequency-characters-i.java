class Solution {
    public int numberOfSubstrings(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int count = 0; 
        
        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++;
            while (freq[s.charAt(right) - 'a'] >= k) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            count += left;
        }
        
        return count;
    }
}
class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        StringBuilder firstHalf = new StringBuilder();
        char middleChar = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                middleChar = (char) (i + 'a');
            }

            int halfCount = freq[i] / 2;
            for (int j = 0; j < halfCount; j++) {
                firstHalf.append((char) (i + 'a'));
            }
        }

        StringBuilder result = new StringBuilder(firstHalf);
        if (middleChar != 0) {
            result.append(middleChar);
        }

        result.append(firstHalf.reverse());

        return result.toString();
    }
}
class Solution {
    public int findTheLongestSubstring(String s) {
        HashMap<Integer, Integer> maskIndex = new HashMap<>();
        maskIndex.put(0, -1);

        int maxLength = 0;
        int mask = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a') {
                mask ^= (1 << 0); 
            } else if (c == 'e') {
                mask ^= (1 << 1); 
            } else if (c == 'i') {
                mask ^= (1 << 2);  
            } else if (c == 'o') {
                mask ^= (1 << 3);  
            } else if (c == 'u') {
                mask ^= (1 << 4); 
            }
            if (maskIndex.containsKey(mask)) {
                maxLength = Math.max(maxLength, i - maskIndex.get(mask));
            } else {
                maskIndex.put(mask, i);
            }
        }

        return maxLength;

    }
}
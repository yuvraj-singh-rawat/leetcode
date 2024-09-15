class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Character, Integer> freq1 = getFrequencyMap(word1);
        Map<Character, Integer> freq2 = getFrequencyMap(word2);

        if (!freq1.keySet().equals(freq2.keySet())) {
            return false;
        }

        List<Integer> values1 = new ArrayList<>(freq1.values());
        List<Integer> values2 = new ArrayList<>(freq2.values());
        
        Collections.sort(values1);
        Collections.sort(values2);
        
        return values1.equals(values2);
    }
    
    private Map<Character, Integer> getFrequencyMap(String word) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        return freqMap;
    }
}
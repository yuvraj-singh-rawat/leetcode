class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> counts = new HashMap<>();

        for (char ch : s.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }


        List<Character> chars = new ArrayList<>(counts.keySet());

        chars.sort((a, b) -> counts.get(b) - counts.get(a));

        StringBuilder result = new StringBuilder();

        for (char ch : chars) {
            int frequency = counts.get(ch);
            for (int i = 0; i < frequency; i++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
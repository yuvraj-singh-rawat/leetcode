class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int k = part.length();

        for (char ch : s.toCharArray()) {
            sb.append(ch);

            if (sb.length() >= k && sb.substring(sb.length() - k).equals(part)) {
                sb.delete(sb.length() - k, sb.length());
            }
        }
        return sb.toString();
    }
}
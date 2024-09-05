class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();

        int paranthesesCount = 0;

        for (int i=0; i<s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(') {
                if (paranthesesCount > 0) {
                    result.append(currentChar);
                }
                paranthesesCount++;
            } else {
                paranthesesCount--;

                if (paranthesesCount > 0) {
                    result.append(currentChar);
                }
            }
        }
        return result.toString();
    }
}
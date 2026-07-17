class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();

        int counter = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (counter > 0) {
                    result.append(ch);
                }
            counter++;
            } else {
                counter--;
                if (counter > 0) {
                    result.append(ch);
                }
            }
        } 
        return result.toString();
    }
}
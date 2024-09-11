class Solution {
    public String reverseWords(String s) {
        int left = 0;
        int right = s.length() - 1;

        // Trim leading and trailing spaces
        while (left <= right && s.charAt(left) == ' ') left++;
        while (right >= left && s.charAt(right) == ' ') right--;

        String temp = "";
        StringBuilder ans = new StringBuilder();

        while (left <= right) {
            char ch = s.charAt(left);

            if (ch != ' ') {
                temp += ch; // Collect characters for the current word  
            } else if (ch == ' ' && !temp.isEmpty()) {
                // Once we encounter a space, prepend the word to `ans`
                if (ans.length() > 0) {
                    ans.insert(0, " ");
                }
                ans.insert(0, temp);
                temp = "";  // Reset temp for the next word
            }
            left++;
        }

        // Append the last word
        if (!temp.isEmpty()) {
            if (ans.length() > 0) {
                ans.insert(0, " ");
        }
        ans.insert(0, temp);
	}
	return ans.toString();
    }
}
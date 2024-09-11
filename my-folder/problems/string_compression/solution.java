class Solution {
    public int compress(char[] chars) {
        int write = 0;  // Index to write compressed characters
        int read = 0;   // Index to read through the input array

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count the consecutive occurrences of the same character
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character to the array
            chars[write] = currentChar;
            write++;

            // If the count is more than 1, write the count as a string
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[write] = c;
                    write++;
                }
            }
        }
        // Return the new length of the compressed array
        return write;
    }
}
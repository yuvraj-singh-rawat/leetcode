class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        int gcdLen = gcd(len1, len2);

        String candidate = str1.substring(0, gcdLen);

        if (canForm(str1, candidate.repeat(len1 / gcdLen)) && canForm(str2, candidate.repeat(len2 / gcdLen))) {
            return candidate;
        } else {
            return "";
        }
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static boolean canForm(String s1, String s2) {
        return (s1 + s2).equals(s2 + s1);
    }
}
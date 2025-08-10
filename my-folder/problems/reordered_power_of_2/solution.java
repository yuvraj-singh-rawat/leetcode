class Solution {
    public boolean reorderedPowerOf2(int n) {
        char[] target = String.valueOf(n).toCharArray();
        Arrays.sort(target);

        for (int i = 0; i < 31; i++) {
            char[] powerDigits = String.valueOf(1 << i).toCharArray();
            Arrays.sort(powerDigits);
            if (Arrays.equals(target, powerDigits)) {
                return true;
            }
        }
        return false;
    }
}
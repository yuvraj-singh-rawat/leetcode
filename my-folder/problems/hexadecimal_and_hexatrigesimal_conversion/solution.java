class Solution {
    public String concatHex36(int n) {
        int square = n * n;
        int cube = n * n * n;

        String hexBase16 = Integer.toHexString(square).toUpperCase();
        String hexBase36 = Integer.toString(cube, 36).toUpperCase();

        return hexBase16 + hexBase36;
    }
}
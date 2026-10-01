class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxRowIndex = 0;
        int maxOnes = 0;

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
           
            if (count > maxOnes) {
                maxOnes = count;
                maxRowIndex = i;
            }
        }

        return new int[]{maxRowIndex, maxOnes};
    }
}
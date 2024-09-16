class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isEqual(grid, i, j, n)) {
                    count++;
                }
            }
        }      
        return count;
    }

    private static boolean isEqual(int[][] grid, int row, int col, int n) {
        for (int k = 0; k < n; k++) {
            if (grid[row][k] != grid[k][col]) {
                return false;
            }
        }
        return true;
    }
}
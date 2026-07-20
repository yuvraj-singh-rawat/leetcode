class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int totalElements = m * n;

        k = k % totalElements;

        List<List<Integer>> result = new ArrayList<>();

        for (int r = 0; r < m; r++) {
            List<Integer> row = new ArrayList<>();
            for (int c = 0; c < n; c++) {
                int new1DIndex = r * n + c;
                
                int original1DIndex = (new1DIndex - k + totalElements) % totalElements;
                
                int origR = original1DIndex / n;
                int origC = original1DIndex % n;
               
                row.add(grid[origR][origC]);
            }
            result.add(row);
        }
        
        return result;
    }
}
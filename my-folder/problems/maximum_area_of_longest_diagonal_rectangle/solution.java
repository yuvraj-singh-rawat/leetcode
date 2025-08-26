class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonalSq = 0; // store largest diagonal squared
        int maxArea = 0;       // store area of the rectangle
        
        for (int[] rect : dimensions) {
            int a = rect[0];
            int b = rect[1];
            
            int diagSq = a * a + b * b;
            int area = a * b;
            
            if (diagSq > maxDiagonalSq) {
                maxDiagonalSq = diagSq;
                maxArea = area;
            } else if (diagSq == maxDiagonalSq) {
                maxArea = Math.max(maxArea, area);
            }
        }
        
        return maxArea;
    }
}
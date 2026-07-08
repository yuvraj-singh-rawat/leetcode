class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) {
            return result;
        }

        for (int i = 0; i < numRows; i++) {
            List<Integer> rowNums = new ArrayList<>(i+1);

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    rowNums.add(1);
                } else {
                    int num = result.get(i-1).get(j) + result.get(i-1).get(j-1);
                    rowNums.add(num);
                }
            }
            result.add(rowNums);
        }
        return result;
    }
}
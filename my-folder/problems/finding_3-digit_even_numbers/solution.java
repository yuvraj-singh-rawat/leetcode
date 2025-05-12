class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) {
            count[d]++; 
        }

        List<Integer> result = new ArrayList<>();

        
        for (int num = 100; num <= 998; num += 2) { 
            int d1 = num / 100;
            int d2 = (num / 10) % 10;
            int d3 = num % 10;

            count[d1]--;
            count[d2]--;
            count[d3]--;

    
            if (count[d1] >= 0 && count[d2] >= 0 && count[d3] >= 0) {
                result.add(num);
            }

            count[d1]++;
            count[d2]++;
            count[d3]++;
        }


        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
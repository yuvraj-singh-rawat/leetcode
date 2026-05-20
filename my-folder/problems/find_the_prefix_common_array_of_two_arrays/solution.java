class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        // int n = A.length;

        // int[] ans = new int[n];
        // int[] freq = new int[n + 1];

        // int count = 0;
                                                                          
        // for (int i = 0; i < n; i++) {
        //     freq[A[i]]++;
        //     if(freq[A[i]] == 2) count++;

        //     freq[B[i]]++;
        //     if(freq[B[i]] == 2) count++;

        //     ans[i] = count;
        // }
        // return ans;


        HashMap<Integer, Integer> map = new HashMap<>();
        int n = A.length;
        int[] ans = new int[n];
        int current = 0;

        for (int i=0; i < n; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            if (map.get(A[i]) == 2) current++;

            map.put(B[i], map.getOrDefault(B[i], 0) + 1);
            if (map.get(B[i]) == 2) current++;

            ans[i] = current;
        }
        return ans;
    }
}
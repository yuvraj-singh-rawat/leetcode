class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> friendSet = new HashSet<>();
        for (int f : friends) {
            friendSet.add(f);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int id : order) {
            if (friendSet.contains(id)) {
                resultList.add(id);
            }
        }
        
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
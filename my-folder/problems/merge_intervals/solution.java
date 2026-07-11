class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals according to starting value
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Store merged intervals
        List<int[]> result = new ArrayList<>();

        // Step 2: Add first interval
        result.add(intervals[0]);

        // Step 3: Start checking from second interval
        for (int i = 1; i < intervals.length; i++) {

            // Current interval
            int[] current = intervals[i];

            // Last interval present in result
            int[] last = result.get(result.size() - 1);

            // Step 4: Check overlap
            if (current[0] <= last[1]) {

                // Merge by updating the ending value
                last[1] = Math.max(last[1], current[1]);

            } else {

                // No overlap, add current interval
                result.add(current);
            }
        }

        // Convert List<int[]> into int[][]
        return result.toArray(new int[result.size()][]);
    }
}
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Sort by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        // Step 2: Start with first interval
        int[] current = intervals[0];
        result.add(current);

        for (int i = 1; i < intervals.length; i++) {

            int[] next = intervals[i];

            // Overlap condition
            if (next[0] <= current[1]) {
                // Merge by extending end
                current[1] = Math.max(current[1], next[1]);
            } else {
                // No overlap → new interval
                current = next;
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
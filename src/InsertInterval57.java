import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval57 {

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> newIntervals = new ArrayList<>();
        for (int[] interval : intervals) {
            if (newInterval == null || interval[1] < newInterval[0]) {
                newIntervals.add(interval);
            } else if (newInterval[1] < interval[0]) {
                newIntervals.add(newInterval);
                newIntervals.add(interval);
                newInterval = null;
            } else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        if (newInterval != null) {
            newIntervals.add(newInterval);
        }
        int[][] result = new int[newIntervals.size()][2];
        for (int i = 0; i < newIntervals.size(); i++) {
            result[i] = newIntervals.get(i);
        }
        return result;
    }
}

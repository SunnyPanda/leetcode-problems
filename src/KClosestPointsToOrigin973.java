import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin973 {

    public static void main(String[] args) {
        int[][] points = {{-95,76},{17,7},{-55,-58},{53,20},{-69,-8},{-57,87},{-2,-42},{-10,-87},{-36,-57},{97,-39},{97,49}};
        int k = 5;
        System.out.println(Arrays.deepToString(kClosest(points, k)));
    }

    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> {
            double distance1 = Math.sqrt(Math.pow(o1[0], 2) + Math.pow(o1[1], 2));
            double distance2 = Math.sqrt(Math.pow(o2[0], 2) + Math.pow(o2[1], 2));
            return Double.compare(distance1, distance2);
        });
        queue.addAll(Arrays.asList(points));
        int[][] closest = new int[k][2];
        for (int i = 0; i < k; i++) {
            closest[i] = queue.remove();
        }

        return closest;
    }
}

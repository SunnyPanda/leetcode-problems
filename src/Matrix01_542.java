import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Matrix01_542 {

    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        System.out.println(Arrays.deepToString(updateMatrix(mat)));
    }

    public static int[][] updateMatrix(int[][] mat) {
        int[][] distances = new int[mat.length][mat[0].length];
        Queue<int[]> q = new ArrayDeque<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    distances[i][j] = 0;
                    q.add(new int[] {i, j});
                } else {
                    distances[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int row = cell[0];
            int col = cell[1];
            int dist = distances[row][col] + 1;
            if (row > 0 && distances[row - 1][col] > dist) {
                distances[row - 1][col] = dist;
                q.add(new int[] {row - 1, col});
            }
            if (row < distances.length - 1 && distances[row + 1][col] > dist) {
                distances[row + 1][col] = dist;
                q.add(new int[] {row + 1, col});
            }
            if (col > 0 && distances[row][col - 1] > dist) {
                distances[row][col - 1] = dist;
                q.add(new int[] {row, col - 1});
            }
            if (col < distances[0].length - 1 && distances[row][col + 1] > dist) {
                distances[row][col + 1] = dist;
                q.add(new int[] {row, col + 1});
            }
        }

        return distances;
    }
}

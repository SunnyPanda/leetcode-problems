import java.util.Arrays;

public class FloodFill733 {

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        System.out.println(Arrays.deepToString(floodFill(image, sr, sc, color)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initColor = image[sr][sc];
        if (initColor != color) {
            image[sr][sc] = color;
            if (sr > 0 && image[sr - 1][sc] == initColor) {
                floodFill(image, sr - 1, sc, color);
            }
            if (sr < image.length - 1 && image[sr + 1][sc] == initColor) {
                floodFill(image, sr + 1, sc, color);
            }
            if (sc > 0 && image[sr][sc - 1] == initColor) {
                floodFill(image, sr, sc - 1, color);
            }
            if (sc < image[0].length - 1 && image[sr][sc + 1] == initColor) {
                floodFill(image, sr, sc + 1, color);
            }
        }
        return image;
    }
}

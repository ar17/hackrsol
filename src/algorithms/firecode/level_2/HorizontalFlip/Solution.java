package algorithms.firecode.level_2.HorizontalFlip;

public class Solution {
    public static void flipHorizontalAxis(int[][] matrix) {
        int rows = matrix.length - 1, cols = matrix[0].length - 1;
        for(int j = 0; j <= cols; j++) {
            for(int i = 0; i <= rows / 2; i++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[rows - i][j];
                matrix[rows - i][j] = temp;
            }
        }

    }
}

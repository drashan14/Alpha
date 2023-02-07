public class LargestElement {
    public static void main(String[] args) {
        int matrix[][] = new int[][] { { 2, 3, 4 }, { 9, 3, 7 }, { 8, 19, 23 } };
        int max = 0;
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

public class DiagonalSum {
    public static void digonalSum(int matrix[][]) {
        // Here 💯💯💯💯💯 The time complexicity is 0(n^2)
        // int sum = 0;
        // int sum1 = 0;
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) {
        // sum = sum + matrix[i][j];
        // } else {
        // if (i + j == matrix.length - 1) {
        // sum1 = sum1 + matrix[i][j];
        // }
        // }
        // }
        // }
        // int endcol = matrix[0].length - 1;
        // int sum1 = 0;
        // if (matrix.length % 2 != 0) {
        // for (int i = 0; i < matrix.length; i++) {
        // int mid = matrix.length / 2;
        // if (i == mid) {
        // sum1 = sum1 + 0;
        // endcol--;
        // } else {
        // sum1 = sum1 + matrix[i][endcol];
        // endcol--;
        // }
        // }
        // } else {
        // for (int i = 0; i < matrix.length; i++) {
        // sum1 = sum1 + matrix[i][endcol];
        // endcol--;
        // }
        // }
        // Here 💯💯💯💯💯 The time complexicity is 0(n)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        // System.out.println(sum1);
        // int ds = sum + sum1;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int matrix[][] = new int[][] { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
        digonalSum(matrix);
    }
}

public class BS10 {

    static int[] BinarySearchinTwoDArray(int[][] matrix, int t) {

        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {

            if (t == matrix[r][c]) {
                return new int[] { r, c };
            }

            else if (t > matrix[r][c]) {
                r++;

            } else if (t < matrix[r][c]) {
                c--;

            }

        }

        return new int[] { -1, -1 };

    }
}

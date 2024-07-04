public class BS4 {

    static int BinarySearchAlgo4(int[] M_A_O_D, int Target) {

        int start = 0;
        int end = M_A_O_D.length - 1;
        boolean isAsc = M_A_O_D[start] <= M_A_O_D[end];
        int middle = 0;

        while (start <= end) {

            middle = start + ((end - start) / 2);

            if (Target == M_A_O_D[middle]) {
                return middle;
            }
            if (isAsc) {

                if (Target < M_A_O_D[middle]) {

                    end = middle - 1;

                } else if (Target > M_A_O_D[middle]) {

                    start = start + 1;

                }

            }

            else {

                if (Target < M_A_O_D[middle]) {

                    start = middle + 1;

                } else if (Target > M_A_O_D[middle]) {

                    end = middle - 1;
                }

            }

        }
        return M_A_O_D[start];
    }

}

public class BS3 {

    static int BinarySearchAlgo3(int[] M_A_O_D, int Target) {

        int start = 0;
        int end = M_A_O_D.length - 1;

        boolean isAsc = M_A_O_D[start] <= M_A_O_D[end];

        while (start <= end) {

            int middle = start - ((end - start) / 2);

            if (Target == middle) {

                return middle;
            }

            else if (isAsc) {

                if (Target < M_A_O_D[middle]) {

                    end = middle - 1;
                }

                else if (Target > M_A_O_D[middle]) {

                    start = middle + 1;
                }

            }

            else if (!isAsc) {

                if (Target < M_A_O_D[middle]) {

                    start = middle + 1;
                }

                else if (Target > M_A_O_D[middle]) {

                    end = middle - 1;
                }

            }

        }
        return -1;
    }

}

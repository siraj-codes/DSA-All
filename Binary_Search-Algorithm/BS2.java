public class BS2 {

    static int BinarySearchAlgo2(int[] arr, int t) {

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {

            int m = (s + e) / 2;

            if (t < arr[m]) {

                s = m + 1;

            } else if (t > arr[m]) {
                e = m - 1;
            } else {
                return m;
            }

        }

        return -1;

    }
}

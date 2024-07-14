// Search in Rotated Binary Search 

public class BS8 {

    static int piv(int[] arr) {

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = (s + e) / 2;

            if (m < e && arr[m] > arr[m + 1]) {

                return m;

            }

            else if (s < m && arr[m - 1] > arr[m]) {
                return m - 1;

            }

            else if (arr[s] >= arr[m]) {
                e = m - 1;

            }

            else {
                s = m + 1;
            }

        }

        return -1;
    }

    static int BinarySearchAlgo(int[] arr, int s, int e, int t) {

        while (s <= e) {
            int m = (s + e) / 2;

            if (t == arr[m]) {

                return m;

            }

            else if (t > arr[m]) {
                s = m + 1;

            }

            else if (t < arr[m]) {
                e = m - 1;

            }

        }
        return -1;
    }

}
public class BS6 {
    static char BinarySearchAlgo6(char[] arr, char Target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (Target >= arr[mid]) {
                start = mid + 1;
            }

            else if (Target <= arr[mid]) {
                end = mid - 1;
            }

        }

        // way 1
        // return start == arr.length ? arr[start % arr.length] : arr[start];

        // way 2
        // if (start == arr.length) {

        // return arr[0];

        // }

        // return arr[start];

        // way 3

        return arr[start % arr.length];
    }
}

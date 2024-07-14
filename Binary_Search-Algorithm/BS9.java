/**
 * BS9
 */
public class BS9 {

    static int peek(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int m = (s + e) / 2;

            if (arr[m] > arr[m + 1]) {

                e = m;

            }

            else {

                s = m + 1;
            }

        }
        return s;

    }
}
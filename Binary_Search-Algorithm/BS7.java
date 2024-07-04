// import java.util.Arrays;

public class BS7 {

    static int[] BinarySearchAlgo7(int[] arr, int Target) {

        int[] ans = new int[2];

        int start = Test(arr, Target, true);
        int end = Test(arr, Target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int Test(int arr[], int target, boolean firsthalf) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int middle = start + ((end - start) / 2);

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            }

            else {
                ans = middle;
                if (firsthalf) {
                    end = middle - 1;
                } else {

                    start = middle + 1;
                }

            }

        }

        return ans;
    }

    // static void BinarySearchAlgo7(int[] nums, int target) {

    // int[] count = new int[2];

    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] == target) {
    // count[0] = i;
    // break;
    // }

    // else {
    // count[0] = -1;

    // }
    // }

    // for (int i = nums.length - 1; i >= 0; i--) {
    // if (nums[i] == target) {
    // count[1] = i;
    // break;
    // }

    // else {
    // count[1] = -1;

    // }
    // }

    // System.out.println(Arrays.toString(count));
    // }

}

public class BS1 {

    static int BinarySearch_1(int[] Assending_Sorted_Array, int Target) {

        int start = 0;
        int end = (Assending_Sorted_Array.length - 1);

        while (start <= end) {

            int middle = (start + end) / 2;

            if (Target < Assending_Sorted_Array[middle]) {

                end = middle - 1;

            }

            else if (Target > Assending_Sorted_Array[middle]) {

                start = middle + 1;

            }

            else {

                return middle;
            }

        }
        return -1;
    }

}

package Array;

import java.util.Arrays;

public class LeftShiftInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 68, 9};
        int n = arr.length;
//        for k times
        int k = 7;
        k = k % n;
        while (k-- > 0) {
            //        only for 1 left shift
            int temp = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
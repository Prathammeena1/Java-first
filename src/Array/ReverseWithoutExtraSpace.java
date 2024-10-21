package Array;

import java.util.Arrays;

public class ReverseWithoutExtraSpace {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 68, 9};
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

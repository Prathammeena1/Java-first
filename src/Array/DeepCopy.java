package Array;

import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int[] temp = new int[arr.length];

//        basic logic

//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[arr.length - (i + 1)];
//        }


//        two pointer se
        int i = arr.length - 1, j = 0;
        while (i >= 0) {
            temp[j++] = arr[i--];
        }

        System.out.println(Arrays.toString(temp));
    }
}

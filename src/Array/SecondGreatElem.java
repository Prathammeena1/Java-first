package Array;

public class SecondGreatElem {
    public static void main(String[] args) {
        int[] arr = {43, 23, 456, 457, 983, 761};
        int f = Math.max(arr[0], arr[1]);
        int s = Math.min(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > f) {
                s = f;
                f = arr[i];
            } else if (arr[i] > s) {
                s = arr[i];
            }
        }
        System.out.println(s);
    }
}

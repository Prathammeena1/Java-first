package Array;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        boolean isSort = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSort = false;
                break;
            }
        }
        System.out.println(isSort ? "Yes" : "No");
    }
}

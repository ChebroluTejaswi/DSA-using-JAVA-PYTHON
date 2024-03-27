package Sorting;

public class Merge_Sort {
    public static void merge(int[] arr, int left, int middle, int right) {
        // storing left subarray elements in leftTmpArray
        int[] leftTmpArray = new int[middle - left + 2];
        for (int i = 0; i <= middle - left; i++) {
            leftTmpArray[i] = arr[left + i];
        }
        // storing right subarray elements in leftTmpArray
        int[] rightTmpArray = new int[right - middle + 1];
        for (int i = 0; i < right - middle; i++) {
            rightTmpArray[i] = arr[middle + 1 + i];
        }
        leftTmpArray[middle - left + 1] = Integer.MAX_VALUE;
        rightTmpArray[right - middle] = Integer.MAX_VALUE;

        // Merging left anf right subarray : in sorted order.
        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            if (leftTmpArray[i] < rightTmpArray[j]) {
                arr[k] = leftTmpArray[i];
                i++;
            } else {
                arr[k] = rightTmpArray[j];
                j++;
            }

        }
    }

    public static void perform_merge_sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            perform_merge_sort(arr, l, m);
            perform_merge_sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        perform_merge_sort(arr, 0, n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

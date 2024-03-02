package Array;

import java.util.*;

class pair {
    int max = 0;
    int min = 0;
}

public class Max_Min_element {

    // -------------------------------------Performing linear search----------------------------------
    // worst case: 1+2(n-2) comparisions - when elements are arranged in descending
    // order.
    // best case: 1+(n-2) comparisions - when elements are arranged in ascending
    // order
    public static pair get_max_min_1(int arr[]) {
        pair ans = new pair();
        if (arr.length == 0) {
            ans.min = 0;
            ans.max = 0;
        } else if (arr.length == 1) {
            ans.min = arr[0];
            ans.max = arr[1];
        } else {
            if (arr[0] > arr[1]) {
                ans.max = arr[0];
                ans.min = arr[1];
            } else {
                ans.max = arr[1];
                ans.min = arr[0];
            }
            for (int i = 2; i < arr.length; i++) {
                if (ans.max < arr[i]) {
                    ans.max = arr[i];
                } else if (ans.min > arr[i]) {
                    ans.min = arr[i];
                }
            }
        }
        return ans;
    }

    // ------------------------------------Tournament method-------------------------------------
    // if n is even: 3n/2 -2, if n is odd: more than 3n/2-2 comparisions are needed
    public static pair get_max_min2(int arr[], int low, int high) {
        pair minmax = new pair();
        pair mml = new pair();
        pair mmr = new pair();

        if (low == high) {
            minmax.min = arr[low];
            minmax.max = arr[low];
            return minmax;
        } else if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.min = arr[high];
                minmax.max = arr[low];
            } else {
                minmax.min = arr[low];
                minmax.max = arr[high];
            }
            return minmax;
        }

        int mid = (low + high) / 2;
        mml = get_max_min2(arr, low, mid);
        mmr = get_max_min2(arr, mid + 1, high);
        if (mml.min < mmr.min) {
            minmax.min = mml.min;
        } else {
            minmax.min = mmr.min;
        }
        if (mml.max > mmr.max) {
            minmax.max = mml.max;
        } else {
            minmax.max = mmr.max;
        }

        return minmax;
    }

    // ------------------------------------Compare in Pairs------------------------------------
    public static pair get_max_min3(int arr[], int n) {
        int x = 0;
        pair ans = new pair();
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                ans.max = arr[0];
                ans.min = arr[1];
            } else {
                ans.max = arr[1];
                ans.min = arr[0];
            }
            x = 2;
        } else {
            x = 1;
            ans.max = arr[0];
            ans.min = arr[0];
        }

        for (int i = x; i < n - 1; i = i + 2) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > ans.max) {
                    ans.max = arr[i];
                }
                if (arr[i + 1] < ans.min) {
                    ans.min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > ans.max) {
                    ans.max = arr[i + 1];
                }
                if (arr[i] < ans.min) {
                    ans.min = arr[i];
                }
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // int ans[] = get_max_min_1(arr); // - Method 1

        // pair ans = get_max_min2(arr, 0, arr.length - 1); // - Method 2

        pair ans = get_max_min3(arr, n);
        System.out.println("Maximum element: " + ans.max);
        System.out.println("Minimum element: " + ans.min);

        sc.close();
    }
}

package Sorting;

public class SelectionSort {
    static void selectionsortMax(int arr[], int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                int temp = arr[i];
                arr[i] = arr[n - 1];
                arr[n - 1] = temp;

            }
        }
    }

    static void selectionsortMin(int arr[], int start, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = start; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        for (int i = start; i < n; i++) {
            if (arr[i] == min) {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;

            }
        }
    }

    // Selection sort in 0(n^2) Time complexicity
    static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 4, 3, 2, 5, 1 };
        int n = arr.length;
        // for (int i = 0; i < arr.length; i++) {
        // // selectionsortMax(arr, n - i);
        // selectionsortMin(arr, i, n);
        // }
        selection(arr);
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]);
        }
    }
}

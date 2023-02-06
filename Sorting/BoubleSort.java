package Sorting;

public class BoubleSort {
    static void sorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // If the array is already sorted then that time using the optimal solution.
    static void sortingsorted(int arr[]) {
        int swaps = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 4, 2, 6, 1, 5 };
        sorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

}

package Sorting;

import java.util.*;

public class InbuiltSortingMethod {
    public static void main(String[] args) {
        Integer arr[] = { 3, 2, 4, 1, 6 };
        // Arrays.sort(arr, 2, 4);
        // for (int i : arr) {
        // System.out.println(i);
        // }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i : arr) {
            System.out.println(i);
        }
        String[] names = { "darshan", "valaksi" };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

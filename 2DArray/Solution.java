import java.util.ArrayList;
import java.util.*;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> List = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            if (nums1[i] != 0) {
                List.add(nums1[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums2[i] != 0) {
                List.add(nums2[i]);
            }
        }
        Collections.sort(List);
        System.out.println(List);
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 0 };
        int arr1[] = { 1 };
        merge(arr, 0, arr1, 1);
    }
}

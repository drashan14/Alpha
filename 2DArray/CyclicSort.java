import java.util.*;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!List.contains(arr[i])) {
                List.add(arr[i]);
            }
        }
        System.out.println(List);

    }

}

public class LargestString {
    public static void main(String[] args) {

        String arr[] = new String[] { "apple", "mango", "zebra", "banana", "maharashtra" };
        String max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max.compareTo(arr[i]) < 0) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}

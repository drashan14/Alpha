public class LargestStringLength {
    public static void main(String[] args) {
        int max = 0;
        String arr[] = new String[] { "apple", "mango", "banana", "maharashtra" };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
            }
        }
        System.out.println(max);
    }

}

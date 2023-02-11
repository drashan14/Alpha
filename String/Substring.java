public class Substring {
    static String substring(String s, int i, int j) {
        String s1 = "";
        for (int k = i; k < j; k++) {
            s1 += s.charAt(k);
        }
        return s1;
    }

    public static void main(String[] args) {
        String s = "Darshan Rathod";
        int i = 0;
        int j = 5;
        System.out.println(s.substring(0, 3));
        System.out.println(substring(s, i, j));
    }
}

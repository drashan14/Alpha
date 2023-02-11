
import java.io.*;
import java.util.ArrayList;

public class RotationOfString {
    public static void main(String[] args) {

        String s = "abcde";
        int k = 0;
        String goal = "bcdea";
        boolean ans = false;
        while (k < s.length() - 1) {
            String s1 = s.substring(k) + s.substring(0, k);

            if (s1.equals(goal)) {
                ans = true;

            }
            k++;
        }

        System.out.println(ans);
    }
}

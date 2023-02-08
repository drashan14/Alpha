import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String s1 = "madam";
        int n = s1.length();
        boolean ans = true;
        for (int i = 0; i < s1.length() / 2; i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - 1 - i)) {
                ans = false;
            }
        }
        if (ans == false) {
            System.out.println("The given staring is not palindrome ");
        } else

        {
            System.out.println("The given string is palindrom");
        }
    }

}

import java.util.*;

public class StringBuilder {
    public static void main(String[] args) throws Exception {

        String s1 = "hey guys i am darshan balaji rathod i am from kader and i want to talk with you ";
        String s = "";
        s += Character.toUpperCase(s1.charAt(0));
        for (int i = 1; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ' && i < s1.length() - 1) {
                s += s1.charAt(i);
                i++;
                s += Character.toUpperCase(s1.charAt(i));
            } else {
                s += s1.charAt(i);
            }
        }
        System.out.println(s);

    }
}

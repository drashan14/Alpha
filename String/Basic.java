import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.next();// It get the only one words of starting
        // String str1 = sc.nextLine();// It gets the whole sentences as a string.
        // System.out.println(str);
        // System.out.println(str1);
        String str2 = new String("darshanrathod");
        System.out.println(str2);
        // The Striare the immutable we can nt change.
        System.out.println(str2.length());
        // In array we just write the arr.length for finding the length
        // But in starig the length is work like a function hence .
        // String concatenation
        String str3 = "darshan";
        String str4 = "rathod";
        System.out.println(str3 + str4);
        // charAt() method to get teh character from the given index. n
        System.out.println(str3.charAt(0));

    }
}
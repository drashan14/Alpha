package Loops.ForLoop;

import java.util.Scanner;

public class RverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            System.out.print(rem);
            n = n / 10;

        }
        System.out.println();
    }

}

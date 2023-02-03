import java.util.Scanner;

public class ButterFly {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int n1 = s1.nextInt();
        for (int i = 1; i <= n * 2; i++) {
            for (int j = 1; j <= n1; j++) {
                if (j > i && j <= (n1 - i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;
//Switch case Example 
public class SwitchCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nuumber a:-");
        //Getting inputfrom user
        int a = sc.nextInt();
        System.out.println("Enter the number b:-");
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Arithmatic Operators");

        }

    }
}

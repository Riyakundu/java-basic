import java.util.*;

public class Factorial {
    public static int fact(int n) {
        int f = 1;
        for (int i = n; i >= 1; i--) {
            f = f * i;
        }
        return (f);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The factorial of this number is =" + fact(n));
    }
}

import java.util.*;

class gcdlcm {
    int a, b, r;
    Scanner sc = new Scanner(System.in);

    public void calculate() {
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        int m = a;
        int n = b;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println("GCD is= " + a);
        System.out.println("LCM is= " + ((m * n) / a));
    }
}

public class Gcd_and_Lcm {
    public static void main(String[] args) {
        gcdlcm obj = new gcdlcm();
        obj.calculate();
    }
}

import java.util.*;

class check {
    int n;
    Scanner sc = new Scanner(System.in);

    public void primeCheck() {
        System.out.print("Enter any number: ");
        n = sc.nextInt();
        int count = 2;
        if (n == 1) {
            System.out.println("1 is a unique number(neither prime nor composite).");
            return;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count != 2) {
            System.out.println("The number " + n + " is not prime.");
        } else {
            System.out.println("The number " + n + " is prime.");
        }
    }
}

public class Prime {
    public static void main(String[] args) {
        check obj = new check();
        obj.primeCheck();
    }
}

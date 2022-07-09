import java.util.*;

class fibo {
    int n;
    Scanner sc = new Scanner(System.in);

    public void calculate() {
        System.out.println("Enter the value upto which you want fibonacci series: ");
        n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("The fibonacci series is= \n" + a + ", " + b + " ,");
        int c = a + b;
        while (c <= n) {
            System.out.print(c + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        fibo obj = new fibo();
        obj.calculate();
    }
}

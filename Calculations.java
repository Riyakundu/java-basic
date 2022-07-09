import java.util.*;

class calculate {
    int a, b;
    Scanner sc = new Scanner(System.in);

    public void operation() {
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        System.out.println("Addition of these two numbers is= " + (a + b));
        System.out.println("Subtraction of these two numbers is = " + (a - b));
        System.out.println("Multiplication of these two numbers is= " + (a * b));
        if (b == 0)
            System.out.println("Invalid....");
        else
            System.out.println("Division of these two numbers is= " + (a / b));
        if (b == 0)
            System.out.println("Invalid...");
        else
            System.out.println("Modulo or remainder is= " + (a % b));
    }
}

public class Calculations {
    public static void main(String[] args) {
        calculate obj = new calculate();
        obj.operation();
    }
}
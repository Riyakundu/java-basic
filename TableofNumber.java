import java.util.*;

class table {
    int n;
    Scanner sc = new Scanner(System.in);

    public void calculate() {
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        System.out.println("The table of " + n + " is given below: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + " = " + (n * i));
        }
    }
}

public class TableofNumber {
    public static void main(String[] args) {
        table obj = new table();
        obj.calculate();
    }
}

import java.util.*;

class Calculations {
    int n, zero = 0, neg = 0, pos = 0;
    Scanner sc = new Scanner(System.in);

    public void cal() {
        System.out.println("Enter the value, how many numbers you want to insert: ");
        n = sc.nextInt();
        System.out.println("Please enter the values:");
        for (int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            if (m == 0) {
                zero++;
            } else if (m > 0) {
                pos++;
            } else {
                neg++;
            }
        }
        System.out.println("Number of positive values you entered = " + pos);
        System.out.println("Number of negative values you entered = " + neg);
        System.out.println("Number of zeros you entered = " + zero);
    }
}

public class positive_negative_zero {
    public static void main(String[] args) {
        Calculations obj = new Calculations();
        obj.cal();
    }
}

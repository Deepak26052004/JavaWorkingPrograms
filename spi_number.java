import java.util.*;

public class spi_number {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int sum = addSum(num);
        int product = mulSum(num);

        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + product);

        if (sum == product) {
            System.out.println(num + " is a Spy Number");
        } else {
            System.out.println(num + " is not a Spy Number");
        }
    }

    public static int addSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int mulSum(int n) {
        if (n == 0) return 0; // handle 0
        int prod = 1;
        while (n > 0) {
            prod *= n % 10;
            n /= 10;
        }
        return prod;
    }
}

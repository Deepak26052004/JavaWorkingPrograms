import java.util.Scanner;

public class fibonacci_rec2
 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Fibonacci series with " + num + " terms:");
            printFibonacci(num, 0, 1);
        }

        sc.close();
    }

    public static void printFibonacci(int n, int f, int s) {
        if (n == 0) return;

        System.out.print(f + " ");
        printFibonacci(n - 1, s, f + s);
    }
}

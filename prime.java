import java.util.Scanner;

public class prime {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

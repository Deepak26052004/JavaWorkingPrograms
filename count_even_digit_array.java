import java.util.Arrays;
import java.util.Scanner;

public class count_even_digit_array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        int s1 = sc.nextInt();
        int a1[] = new int[s1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.println("Array 1:" + Arrays.toString(a1));
        
        int c = 0;
        for (int i = 0; i < a1.length; i++) {
            if (countDigits(a1[i]) % 2 == 0) {
                c++;
            }
        }
        System.out.println("Count of numbers with even digits: " + c);
    }

    public static int countDigits(int i) {
        i = Math.abs(i);
        int c = 0;
        if (i == 0) return 1;
        while (i > 0) {
            i /= 10;
            c++;
        }
        return c;
    }
}

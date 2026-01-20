import java.util.Arrays;
import java.util.Scanner;

public class count_prime_array {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        int s1=sc.nextInt();
        int a1[]=new int[s1];
            for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }
        System.out.println("Array 1:"+Arrays.toString(a1));
        int c=0;
        for(int i=0;i<a1.length;i++){
            if(isPrime(a1[i])){
                c++;
            }

        }
        System.out.println("Prime Number count:"+c);
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

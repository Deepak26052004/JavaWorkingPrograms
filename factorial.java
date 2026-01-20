import java.util.Scanner;

public class factorial {
    static int num;
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Your Number:");
        num=sc.nextInt();
        System.out.println("Factorial of the "+num+" is :"+factorial(num));

    }
    public static int factorial(int n) {
    if (n == 0) return 1;
    return n * factorial(n - 1);
}

}
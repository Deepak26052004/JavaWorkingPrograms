
import java.util.Scanner;

public class swap {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number1:");
        int num1=sc.nextInt();
        System.out.print("Enter Number2:");
        int num2=sc.nextInt();
        System.out.println("Before Swapping: num1=" + num1 + ", num2=" + num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After Swapping: num1=" + num1 + ", num2=" + num2);
        

    }
}

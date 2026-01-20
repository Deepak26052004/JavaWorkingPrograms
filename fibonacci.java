import java.util.Scanner;

public class fibonacci {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int first=0,second=1;
        System.out.print("Enter Your Number:");
        int num=sc.nextInt();
        System.out.println("Fibonacci Series of "+num+" is :");
        for(int i=1;i<=num;i++)
        {
            System.out.print(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }
    }
}

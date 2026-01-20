import java.util.Scanner;

public class recursion4 {
    static Scanner sc=new Scanner(System.in);
    static int n,s;
    public static void main(String[] args) {
        System.out.print("Enter Your Starting Number:");
        s=sc.nextInt();
        System.out.print("Enter Your Nth Number:");
        n=sc.nextInt();
        recB(s,n);
    }
    public static void recB(int s,int n)
    {
        if(s<=n)
        {
            System.out.print(s+" ");
            s++;
            recB(s, n);
        }
        
    }
}

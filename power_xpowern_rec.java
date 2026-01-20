import java.util.Scanner;

public class power_xpowern_rec {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter X:");
        int x=sc.nextInt();
        System.out.print("Enter N:");
        int n=sc.nextInt();
        int res=power(x,n);
        System.out.print("Result of "+x+"^"+n+" is :"+res);
    }
    public static int power(int x,int n){
        if(n==0) return 1;
        return x*power(x, n-1);
        
    }
}

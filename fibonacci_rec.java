import java.util.Scanner;

public class fibonacci_rec {
    static Scanner sc=new Scanner(System.in);
    static int next,num;
    public static void main(String[] args) {
        System.out.println("Enter Your Number:");
        num=sc.nextInt();
        fibonacci(0,1);
    }
    public static void fibonacci(int f,int s){
        if(num>=1){
            System.out.print(f+" ");
            num--;
            next=f+s;
            f=s;
            s=next;
            fibonacci(f, s);
        }

    }
}

import java.util.Scanner;

public class recursion {
    static Scanner sc= new Scanner(System.in);
    static int ans=1;
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int res=findFactorial(num);
        System.out.println("Factorial of "+num+" is : "+res);
        System.out.println("End!!!");
    }
    public static int findFactorial(int num){
        if(num>=2){
            ans*=num--;
            findFactorial(num);
        }
        return ans;
    }
}

import java.util.Scanner;

public class recursion3 {
    static Scanner sc=new Scanner(System.in);
    static char ch;
    public static void main(String[] args) {
        System.out.print("Enter Your Starting Character:");
        ch=sc.next().charAt(0);
        recA(ch);
    }
    public static void recA(char ch)
    {
        if(ch<='Z')
        {
            System.out.print(ch+" ");
            ch++;
            recA(ch);
        }
        
    }
}

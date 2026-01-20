import java.util.Scanner;

public class printA_to_Z {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1.Capital\n2.Small");
        System.out.print("Enter Your choice:");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                printAlpha('A','Z');
                break;
            case 2:
                printAlpha('a', 'z');
                break;
            default:
                System.out.println("Invalid Choice, please enter correct choice");
                break;
        }

        
    }
    public static void printAlpha(char curr,char n)
    {
        if(curr>n) return;
        System.out.print(curr+" ");
        printAlpha((char)(curr+1), n);
    }
}

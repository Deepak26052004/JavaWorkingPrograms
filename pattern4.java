import java.util.Scanner;

public class pattern4 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("En1ter Your Number:");
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                if(i+j>=num-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


import java.util.Scanner;

public class hackerrank1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();

            for(int j=0;j<n;j++){
                a+=b*Math.pow(2, j);
                System.out.print(a+" ");
            }
            System.out.println();
        }
       
    }
}

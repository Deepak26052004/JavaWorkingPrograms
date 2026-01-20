import java.util.Arrays;
import java.util.Scanner;

public class find_nth_smallest {
    static Scanner sc=new Scanner(System.in);
    public static int findSmallest(int[]a){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        return smallest;
    }
    public static void replaceSmallest(int[]a,int smallest){
        for(int i=0;i<a.length;i++){
            if(a[i]==smallest){
                a[i]=Integer.MAX_VALUE;
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the Size of the array:");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original Array:"+Arrays.toString(a));
        System.out.print("Enter N value:");
        int n=sc.nextInt();
        int smallest=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            smallest=findSmallest(a);
            replaceSmallest(a, smallest);
        }
        if (smallest != Integer.MAX_VALUE) {
            System.out.println(smallest+" is the "+n+"th largest value of the array.");
        }
    }
}

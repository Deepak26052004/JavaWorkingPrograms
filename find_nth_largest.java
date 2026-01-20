import java.util.Arrays;
import java.util.Scanner;

public class find_nth_largest {
    static Scanner sc=new Scanner(System.in);
    public static int findLargest(int[]a){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        return largest;
    }
    public static void replaceLargest(int[]a,int largest){
        for(int i=0;i<a.length;i++){
            if(a[i]==largest){
                a[i]=Integer.MIN_VALUE;
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
        int largest=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            largest=findLargest(a);
            replaceLargest(a, largest);
        }
        if (largest != Integer.MIN_VALUE) {
            System.out.println(largest+" is the "+n+"th largest value of the array.");
        }
    }
}

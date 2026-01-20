import java.util.Arrays;
import java.util.Scanner;

public class rotate_array {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter N:");
        int n=sc.nextInt();
        System.out.println("Original Array:"+Arrays.toString(a));
        int res[]=rotateArray(a,n);
        System.out.println("After Rotation:"+Arrays.toString(a));
    }
    public static int[] rotateArray(int[] a,int n){
        for(int k=1;k<=n;k++){
            int first=a[0];
            for(int i=1;i<a.length;i++){
                a[i-1]=a[i];
            }
            a[a.length-1]=first;
        }
        return a;
    }
    
}

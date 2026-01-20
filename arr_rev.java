import java.util.*;

public class arr_rev {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            System.out.print("Enter the "+i+"th element:");
            a[i]=sc.nextInt();
        }
        System.out.println("Original Array:"+Arrays.toString(a));
        // System.out.println("Reverse of the array:");
        // for(int i=a.length - 1;i>=0;i--){
        //     System.out.print(a[i]+" ");
        // }
        int rev_arr[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            rev_arr[i]=a[a.length-1-i];
        }
        System.out.println("Reverse Array:"+Arrays.toString(rev_arr));

    }
}

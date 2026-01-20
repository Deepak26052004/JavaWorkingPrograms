import java.util.Arrays;
import java.util.Scanner;

public class largest_ele_array {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Size of the array:");
        int size=sc.nextInt();
        int a[]=new int[size];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array:"+Arrays.toString(a));
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
    }
    System.out.println("Largest Element:"+largest);

    }
    
}

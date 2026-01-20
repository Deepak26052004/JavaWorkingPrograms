import java.util.Arrays;
import java.util.Scanner;

public class twosum {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Size of the array:");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original Array:"+Arrays.toString(a));
        int targest=10;
        targestTwoSum(a,targest);
    }
    public static void targestTwoSum(int a[],int targest){
        Arrays.sort(a);
        int l=0,r=a.length-1;
        while (l<r) {
            if(a[l]+a[r]==targest) System.out.println(a[l]+" + "+a[r]+" = "+targest);

            if(a[l]+a[r]>targest) r--;
            else l++;
        }
    }
}

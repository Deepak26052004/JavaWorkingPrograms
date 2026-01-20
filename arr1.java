// WAJP TO FIND EVEN AND ODD SUMS IN USER DEFINED ARRAY. 

import java.util.Scanner;

public class arr1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int arr1[]=new int[size];
        for(int i=0;i<size;i++){
            arr1[i]=sc.nextInt();
        }
        int even_sum=0;
        int odd_sum=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%2==0){
                even_sum+=arr1[i];
            }
            else{
                odd_sum+=arr1[i];
            }
        }
        System.out.println("Even Sum:"+even_sum);
        System.out.println("Odd Sum:"+odd_sum);
    }
}

// 5.WAJP TO FIND LARGEST ELEMENT IN USER DEFINED ARRAY. 
import java.util.*;
public class arr5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr1[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        int max=arr1[0];
        for(int i=1;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        System.out.println("Original Array:"+Arrays.toString(arr1));
        System.out.println("Largest Element of the array:"+max);
}
}
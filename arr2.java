// 2.WAJP TO FIND AVERAGE OF ARRAY VALUES IN USER DEFINED ARRAY. 
import java.util.*;

public class arr2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr1[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for(int i=0; i<size; i++) {
            arr1[i] = sc.nextInt();
        }

        double sumarr = 0.0;
        for(int i=0; i<arr1.length; i++) {
            sumarr += arr1[i];
        }

        double aver_of_arr = sumarr / arr1.length;

        System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("Average of Array Values: " + aver_of_arr);
    }
}


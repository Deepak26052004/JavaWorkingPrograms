import java.util.*;

public class arr3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr1[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        // Step 1: Count numbers divisible by 5
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 5 == 0) {
                count++;
            }
        }

        // Step 2: Create array of that size
        int arr_div_5[] = new int[count];
        int ind = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 5 == 0) {
                arr_div_5[ind] = arr1[i];
                ind++;
            }
        }

        // Step 3: Print results
        System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("Divisible by 5 Array: " + Arrays.toString(arr_div_5));
    }
}

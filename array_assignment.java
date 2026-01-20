import java.util.Arrays;
import java.util.Scanner;

public class array_assignment {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Rotate Array");
            System.out.println("2. Removing Duplicate");
            System.out.println("3. Missing Number");
            System.out.println("4. Reverse the Array");
            System.out.println("5. Move Zeros");
            System.out.println("6. 1st Largest & 1st Smallest");
            System.out.println("7. Find Prime Numbers");
            System.out.println("8. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int a[] = {10, 20, 30, 40, 50};
                    System.out.println("Before Rotating: " + Arrays.toString(a));
                    System.out.print("Enter how many times to rotate the array (N): ");
                    int n = sc.nextInt();
                    int res[] = rotateArray(a, n);
                    System.out.println("After Rotating: " + Arrays.toString(res));
                    break;
                case 2:
                    int [] b={8,4,8,3,7,2,4,1,5,1,6};
                    System.out.println("Before Removing duplicate element:"+Arrays.toString(b));
                    int res2[]=removeDup(b);
                    System.out.println("After Removing duplicate element:"+Arrays.toString(res2));
                    break;
                case 3:
                    int[] c={1,2,5,7,11};
                    System.out.println("Original Array:"+Arrays.toString(c));
                    System.out.println("Missing Element in the above array:");
                    findMissingNumber(c);
                    System.out.println();
                    break;
                case 4:
                    int d[]={8,3,4,6};
                    System.out.println("Before Reversing:"+Arrays.toString(d));
                    int res3[]=revArray(d);
                    System.out.println("After Reversing:"+Arrays.toString(res3));
                    break;


                case 8:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        } while (choice != 8);
    }

    public static int[] rotateArray(int a[], int n) {
        int len = a.length;
        n = n % len;
        for (int k = 1; k <= n; k++) {
            int first = a[0];
            for (int i = 1; i < a.length; i++) {
                a[i - 1] = a[i];
            }
            a[a.length - 1] = first;
        }
        return a;
    }
    public static int[] removeDup(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==Integer.MIN_VALUE) continue;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=Integer.MIN_VALUE;
                }
            }
        }
        int res[]=new int[a.length-count];
        for(int i=0,x=0;i<a.length;i++){
            if(a[i]!=Integer.MIN_VALUE) res[x++]=a[i];
        }
        return res;
    }
    public static void findMissingNumber(int a[]){
        for(int i=0,m=1;i<a.length;i++,m++){
            if(a[i]!=m){
                System.out.print(m+" ");
                i--;
            }
        }
    }
    public static int[] revArray(int a[]){
        int l=0,r=a.length-1;
        while (l<r) {
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        return a;
    }
}

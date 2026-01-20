import java.util.Arrays;
import java.util.Scanner;

public class mini_program2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Insertion Sort");
        System.out.println("2. Merge Sort");
        System.out.println("3. Counting Sort");
        System.out.print("Enter Your Option: ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                int a[] = {5, 4, 3, 1, 2};
                System.out.println("Before Sorting: " + Arrays.toString(a));
                insertionSort(a);
                System.out.println("After Sorting: " + Arrays.toString(a));
                break;

            case 2:
                int a1[] = {1, 0, 9, 2, 3, 8, 4, 7, 6, 5};
                System.out.println("Before Sorting: " + Arrays.toString(a1));
                mergeSort(a1, 0, a1.length - 1);
                System.out.println("After Sorting: " + Arrays.toString(a1));
                break;

            case 3:
                int a2[] = {7, 3, 4, 1, 7, 6, 3, 2, 1, 8, 4, 1};
                System.out.println("Before Sorting: " + Arrays.toString(a2));
                countingSort(a2);
                System.out.println("After Sorting: " + Arrays.toString(a2));
                break;

            case 4:
                int a3[]={4,1,5,3,2};
                System.out.println("Before Sorting: " + Arrays.toString(a3));
                selectionAscendingSort(a3);
                System.out.println("After Sorting: " + Arrays.toString(a3));
                selectionDescendingSort(a3);
                System.out.println("After Sorting: " + Arrays.toString(a3));



            default:
                System.out.println("Invalid Option! Try Again.");
                break;
        }
    }

    public static void insertionSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int curr = a[i];
            int prev = i - 1;
            while (prev >= 0 && a[prev] > curr) {
                a[prev + 1] = a[prev];
                prev--;
            }
            a[prev + 1] = curr;
        }
    }

    public static void mergeSort(int a[], int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, h);
            merge(a, l, mid, h);
        }
    }

    public static void merge(int a[], int l, int mid, int h) {
        int n1 = mid - l + 1;
        int n2 = h - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) left[i] = a[l + i];
        for (int j = 0; j < n2; j++) right[j] = a[mid + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) a[k++] = left[i++];
            else a[k++] = right[j++];
        }
        while (i < n1) a[k++] = left[i++];
        while (j < n2) a[k++] = right[j++];
    }

    public static void countingSort(int a[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) largest = a[i];
        }

        int res[] = new int[largest + 1];
        for (int i = 0; i < a.length; i++) {
            res[a[i]]++;
        }

        for (int i = 0, x = 0; i < res.length; i++) {
            while (res[i] > 0) {
                a[x++] = i;
                res[i]--;
            }
        }
    }
    public static void selectionAscendingSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int s=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[s]) s=j;
            }
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    public static void selectionDescendingSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int s=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[s]) s=j;
            }
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    public static void bubbleSort(int[]a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}

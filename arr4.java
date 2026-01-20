// 4.WAJP TO SEARCH ELEMENTS PRESENT IN THE ARRAY
import java.util.Scanner;
public class arr4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr1[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Search Element:");
        int sear=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==sear){
                System.out.println("Yes, We go it the element present in "+i+" index");
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.print("Not Present in the array");
        }
            

    
    
    }}

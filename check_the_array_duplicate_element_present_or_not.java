import java.util.Arrays;
import java.util.Scanner;

public class check_the_array_duplicate_element_present_or_not {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Size of the array:");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original Array:"+Arrays.toString(a));
        System.out.println(checkDuplicate1(a));
        System.out.println(checkDuplicate2(a));
    }
    public static boolean checkDuplicate1(int[]a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]) return true;
            }
        }
        return false;
    }
    public static boolean checkDuplicate2(int a[]){
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]) return true;
        }
        return false;
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Sunrise {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Size of the array:");
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original Array:"+Arrays.toString(a));
        int res=countVisibleSunRise(a);
        System.out.println("Count of the sunrise visible building :"+res);
    }
    public static int countVisibleSunRise(int[]a){
        int count=1,largest=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>largest){
                count++;
                largest=a[i];
            }
        }
        return count;
    }
}

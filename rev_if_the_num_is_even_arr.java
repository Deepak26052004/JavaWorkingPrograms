import java.util.Arrays;
import java.util.Scanner;

public class rev_if_the_num_is_even_arr {
   static Scanner sc=new Scanner(System.in);
   public static void main(String[] args) {
    System.out.println("Enter the size of the array:");
    int s1=sc.nextInt();
    int a1[]=new int[s1];
    for(int i=0;i<a1.length;i++){
        a1[i]=sc.nextInt();
    }
    System.out.println("Array 1:"+Arrays.toString(a1));
   
   for(int i=0;i<a1.length;i++){
    if(a1[i]%2==0){
        a1[i]=revNum(a1[i]);
    }
   }
   System.out.println("After Reversing the even element in the Array :"+Arrays.toString(a1));
}
public static int revNum(int n){
    int rev=0;
    while (n>0) {
        rev=(rev*10)+(n%10);
        n/=10;
    }
    return rev;
}

}

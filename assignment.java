import java.util.Arrays;

public class assignment {
    public static void main(String[] args) {
        int a[] = {234, 2814, 316, 721, 15, 14};
        int n=a.length;
        System.out.println("Original Array:"+Arrays.toString(a));
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=sumOfLarSmall(a[i]);
        }
        System.out.println("Sum of Maximum and Minimum:"+Arrays.toString(res));
        int rev[]=new int[n];
        for(int i=0;i<n;i++){
            rev[i]=res[n-1-i];
        }
        System.out.println("Reverse the max and min sum array:"+Arrays.toString(rev));
        System.out.println("\nPrint the Array element based on the reverse:");
        for(int i=0;i<n;i++){
           if(rev[i]%2==0){
            print(a,rev,i);
        }else{
            System.out.println(a[i]);
        }
          
    }}
    public static int sumOfLarSmall(int n){
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        while (n>0) {
            int dig=n%10;
            if(dig>max) max=dig;
            if(dig<min) min=dig;
            n/=10;
        }
        return max+min;
    }
    public static void print(int a[],int rev[],int i){
        for(int j=1;j<=rev[i];j++){
                System.out.print(a[i]+" ");
            }
        System.out.println();
    }
    
}

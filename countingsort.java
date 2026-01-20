import java.util.*;

public class countingsort {
    public static void main(String[] args) {
        int a[]={1,2,3,1,5,2,1};
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(a));
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        int res[]=new int[largest+1];
        for(int i=0;i<a.length;i++){
            res[a[i]]++;
        }
        for(int i=0,x=0;i<res.length;i++){
            while (res[i]>0) {
                a[x]=i;
                res[i]--;
                x++;
            }
        }
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(a));
    }
}

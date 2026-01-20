import java.util.*;

public class merge_two_array2 {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the first array:");
        int s1=sc.nextInt();
        int a1[]=new int[s1];
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }
        System.out.println("Array 1:"+Arrays.toString(a1));
        
        System.out.println("Enter the size of the second array:");
        int s2=sc.nextInt();
         int a2[]=new int[s2];
        for(int i=0;i<a2.length;i++){
            a2[i]=sc.nextInt();
        }
       
        System.out.println("Array 2:"+Arrays.toString(a2));
        int res[]=mergeArray(a1, a2);
        System.out.println("Result:"+Arrays.toString(res));
    }
    public static int[] mergeArray(int[] a,int[] b){
        int res[]=new int[a.length+b.length];
        for(int i=0,x=0,y=b.length-1;i<res.length;i++){
            if(x<a.length){
                res[i]=a[x];
                x++;
            }
            else if(y>=0){
                res[i]=b[y];
                y--;
            }
        }
        return res;
    }
}

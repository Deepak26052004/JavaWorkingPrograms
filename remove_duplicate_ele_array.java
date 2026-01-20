import java.util.Arrays;
public class remove_duplicate_ele_array {
    public static void main(String[] args) {
        int a[]={8,4,8,3,7,2,4,1,2};
        System.out.println("Original Array:"+Arrays.toString(a));
        int res[]=removeDuplicate(a);
        System.out.println("Result Array:"+Arrays.toString(res));
    }
    public static int[] removeDuplicate(int a[]){
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
            if(a[i] != Integer.MIN_VALUE) res[x++]=a[i];
        }
        return res;
        }
    }


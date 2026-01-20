import java.util.*;
public class Defuse_the_bomb {
    public static void main(String[] args) {
        int code[]={5,7,1,4};
        int k = 3;
        System.out.println("Result Array:"+Arrays.toString(code));
        res[]=defuseTheBomb(code,k);
        System.out.println("Result Array:"+Arrays.toString(res));
    }
    public static int[] defuseTheBomb(int a[],int key){
        int n=a.length;
        int res[]=new int[n];
        if(k==0){
            for(int i=0;i<n;i++){
                res[i]=0;
            }
        }
        else if(k>0){
            for(int i=0;i<n;i++){
                res[i]=a[(i+1)%n]+a[(i+2)%n];
            }
        }
        else if(k<0){
            for(int i=0;i<n;i++){
                res[i]=a[(i+2)%n]+a[(i+3)%n];
            }
        }
        return res;
    }
}

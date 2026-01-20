import java.util.Arrays;

public class dee {
    public static void main(String[] args) {
        int nums1[]={1};
        int m = 1;
        int nums2[] = {2,5,6};
        int n = 0;
        int new1[]=new int[m];
        int new2[]=new int[n];
        for(int i=0;i<m;i++) new1[i]=nums1[i];
        for(int i=0;i<n;i++) new2[i]=nums2[i];
        System.out.println(Arrays.toString(new1));
        System.out.println(Arrays.toString(new2));
        int res[]=new int[new1.length+new2.length];
        int left=0,right=0,x=0;
        while (left<new1.length && right<new2.length) {
            if(new1[left]<new2[right]) res[x++]=new1[left++];
            else res[x++]=new2[right++];
        }
        while (left<new1.length) {
            res[x++]=new1[left++];
        }
        while (right<new2.length) {
            res[x++]=new2[right++];
        }
        System.out.println(Arrays.toString(res));
    }
}

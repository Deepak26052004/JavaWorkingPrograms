import java.util.Arrays;

public class revarray {
    public static void main(String[] args) {
        int a[]={2,3,4,5,6,7,8};
        int l=0,r=a.length-1;
        while (l<r) {
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(a));
    }
}

import java.util.Arrays;

public class two_d_array_rev {
    public static void main(String[] args) {
        int a[][]={{1,2,3},
                   {4,5,6},
                    {7,8,9}};
        for(int i=0;i<a.length;i++){
            revMyArray(a[i]);
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void revMyArray(int a[]){
        int l=0,r=a.length-1;
        while (l<r) {
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
    }
}

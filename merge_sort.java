import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int a[]={1,0,9,2,3,8,4,7,6,5};
        mergeSort(a,0,a.length-1);
        System.out.println("Sorted Array:"+Arrays.toString(a));
    }
    public static void mergeSort(int a[],int l,int h){
        if(l<h){
            int mid=(l+h)/2;
            mergeSort(a, l, mid);
            mergeSort(a, mid+1, h);
            merge(a,l,mid,h);
        }
    }
    public static void merge(int a[],int l,int mid,int h){
        int n1=mid-l+1;
        int n2=h-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++) left[i]=a[l+i];
        for(int j=0;j<n2;j++) right[j]=a[mid+1+j];
        int i=0,j=0,k=l;
        while (i<n1 && j<n2) {
            if(left[i]<=right[j]) a[k++]=left[i++];
            else a[k++]=right[j++];
        }
        while (i<n1) a[k++]=left[i++];
        while (j<n2) a[k++]=right[j++];

    }
}

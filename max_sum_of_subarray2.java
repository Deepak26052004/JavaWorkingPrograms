public class max_sum_of_subarray2 {
    public static void main(String[] args) {
        int a[]={2,-3,7,-4,6};
        int maxsum=a[0],curr_sum=a[0];
        for(int i=1;i<a.length;i++){
            curr_sum=Math.max(a[i],curr_sum+a[i]);
            maxsum=Math.max(maxsum, curr_sum);
        }
        System.out.println("Maximum Sum Subarray:"+maxsum);
    }
}

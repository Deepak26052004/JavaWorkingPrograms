class max_sum_of_subarray {
    static int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        int a[]={2,-3,7,-4,6};
        System.out.println("Sum of the Sub array:");
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=a[k];
                }
                System.out.print(sum+" ");
                max=Math.max(sum,max);
                
            }
            System.out.println();
        }
        System.out.println("\nMaximum sum of the sub array:"+max);
    }
}

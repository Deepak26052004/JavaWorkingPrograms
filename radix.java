public class radix {
    public static void main(String[] args) {
        int a[]={170, 45, 75, 90, 802, 24, 2, 66};
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest) largest=a[i];
        }
        int c=0;
        while (largest>0) {
            largest/=10;
            c++;
        }
        System.out.println(c);
    }
}

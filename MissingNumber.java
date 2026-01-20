public class MissingNumber {
    public static void main(String[] args) {
        int[] a={1,2,4,8};
        printMissingNumber(a);
    }
    public static void printMissingNumber(int a[]){
        for(int i=0,m=1;i<a.length;i++,m++){
            if(a[i] != m){
                System.out.print(m+" ");
                i--;
            }
        }
    }
}

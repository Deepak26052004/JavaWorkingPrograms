public class qwer {
    public static void main(String[] args) {
        int n=225;
        int rev=0,c=2,i=1;
        while (n>0 && i<=c) {
            rev=(rev*10)+(n%10);
            n/=10;
        }
        System.out.println(rev);
    }
}

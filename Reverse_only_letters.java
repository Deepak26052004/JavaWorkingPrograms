public class Reverse_only_letters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        char[] a=s.toCharArray();
        int l=0,r=a.length-1;
        while (l<r) {
            if(Character.isLetter(a[l]) && Character.isLetter(a[r])){
                char temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r--;
            }
            else if(!Character.isLetter(a[l])) l++;
            else if(!Character.isLetter(a[r])) r--;
        }
        System.out.println( new String(a));
    }
}

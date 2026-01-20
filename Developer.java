public class Developer {
    public static void main(String[] args) {
        String s="Developer";
        String rev="";
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(rev.indexOf(a) ==-1) rev+=a;
        }
        System.out.println(rev);
    }
}

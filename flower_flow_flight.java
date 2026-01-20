import java.util.*;
public class flower_flow_flight {
    public static void main(String[] args) {
        String[] s={"flower","flow","flight"};
        Arrays.sort(s);
        String res=solve(s);
        System.out.println("Original String Array:"+Arrays.toString(s));
        System.out.println("Result String:"+res);
    }
    public static String solve( String[] s){
        String s1=s[0],s2=s[s.length-1],ans="";
        for(int i=0;i<s1.length() && i<s2.length();i++){
            char a=s1.charAt(i);
            char b=s2.charAt(i);
            if( a != b) return ans;
            else ans+=a;
        }
        return ans;
    }
}

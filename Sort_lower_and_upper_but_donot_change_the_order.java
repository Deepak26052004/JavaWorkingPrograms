import java.util.Arrays;

public class Sort_lower_and_upper_but_donot_change_the_order {
    public static void main(String[] args) {
        String s="beDAafNZMc";
        String res=challengeToken(s);
        System.out.println(s);
        System.out.println(res);
    }
    public static String challengeToken(String s){
        char a[]=s.toCharArray();
        Arrays.sort(a);
        int u=0,l=0;
        for(int i=0;i<a.length;i++){
            if(Character.isLowerCase(a[i])){
                l=i;
                break;
            }
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            char letter=s.charAt(i);
            if(Character.isLowerCase(letter)) ans+=a[l++];
            else if(Character.isUpperCase(letter)) ans+=a[u++];
            else ans+=letter;
        }
        return ans;

    }
}

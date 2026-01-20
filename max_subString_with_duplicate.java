public class max_subString_with_duplicate {
    public static void main(String[] args) {
        String s="HelloworldNanbasand";
        for(int i=0;i<s.length();i++){
            String temp="";
            for(int j=i+1;j<s.length();j++){
                temp+=s.charAt(j);
            }
            String res2=removeDuplicate(temp);
            System.out.println(res2);
        }
    }
    public static String removeDuplicate(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(res.indexOf(a) != -1) res+=a;
        }
        return res;
    }
}

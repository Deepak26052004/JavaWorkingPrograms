public class pangram {

    public static void main(String[] args) {
        String s="abcdefghijklmnopqrstuvwxyz";
        if(checkPangram(s)) System.out.println("\""+s+"\""+" is a Pangram String");
        else System.out.println("\""+s+"\""+" is Not Pangram String");
    }

    public static boolean checkPangram(String s){
        s=s.toLowerCase();
        for(char i='a';i<='z';i++){
            if(s.indexOf(i)==-1) return false;
        }
        return true;
    
    }
}
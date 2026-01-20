import java.util.Scanner;

public class recursion_rev_str {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the string:");
        String s=sc.nextLine();
        // String res=rev_Str(s);
        // System.out.println("Reverse of "+s+" is :"+res);
        if(s.equals(rev_Str(s))){
            System.out.println(s+" is a Palindrome.");
        }
        else{
            System.out.println(s+" is not a Palindrome.");
        }
    }
    public static String rev_Str(String s){
        if(s.isEmpty()) return "";
        return rev_Str(s.substring(1))+s.charAt(0);
    } 
}

import java.util.*;
public class anagram {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length()) return false;

        char[] aarr = a.toCharArray();
        char[] barr = b.toCharArray();
        Arrays.sort(aarr);
        Arrays.sort(barr);

        return Arrays.equals(aarr, barr);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first String:");
        String a = scan.next();
        System.out.println("Enter the Second String:");
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

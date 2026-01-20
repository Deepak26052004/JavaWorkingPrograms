import java.util.Scanner;

public class Vowels_of_each_string {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        sc.nextLine();

        String arr[] = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        int arr2[] = new int[size];

        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                char ch = Character.toLowerCase(arr[i].charAt(j));
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            arr2[i] = count;
        }

        System.out.println("\nVowel counts in each string:");
        for (int i = 0; i < size; i++) {
            System.out.println("String: \"" + arr[i] + "\" -> Vowels: " + arr2[i]);
        }
    }
}

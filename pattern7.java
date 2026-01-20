import java.util.Scanner;

public class pattern7 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Your Number:");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            char d = 'A';
            for (int j = 0; j < num; j++) {
                if (i <= j) {
                    System.out.print(d++ + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
1
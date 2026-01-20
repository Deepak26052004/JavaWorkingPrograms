import java.util.Scanner;

public class TwoDArrayTraversal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter row size:");
        int row = sc.nextInt();
        System.out.println("Enter column size:");
        int col = sc.nextInt();

        int a[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the element in [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        int choice;
        do {
            System.out.println("\n=== Array Traversal Menu ===");
            System.out.println("1. Top to Bottom & Left to Right");
            System.out.println("2. Top to Bottom & Right to Left");
            System.out.println("3. Bottom to Top & Left to Right");
            System.out.println("4. Bottom to Top & Right to Left");
            System.out.println("5. Sum of all the rows");
            System.out.println("6. Sum of all the columns");
            System.out.println("7. Sum of all the diagonals");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printTopLeft(a);
                    break;
                case 2:
                    printTopRight(a);
                    break;
                case 3:
                    printBottomLeft(a);
                    break;
                case 4:
                    printBottomRight(a);
                    break;
                case 5:
                    int resRows = sumOfAllRows(a);
                    System.out.println("\nTotal sum of all rows: " + resRows);
                    break;
                case 6:
                    int resCols = sumOfAllColumns(a);
                    System.out.println("\nTotal sum of all columns: " + resCols);
                    break;
                case 7:
                    int resDiagonals = sumOfDiagonal(a);
                    System.out.println("\nTotal sum of all diagonals: " + resDiagonals);
                    break;
                case 8:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 8);
    }

    static void printTopLeft(int[][] a) {
        System.out.println("\nTop to Bottom & Left to Right:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printTopRight(int[][] a) {
        System.out.println("\nTop to Bottom & Right to Left:");
        for (int i = 0; i < a.length; i++) {
            for (int j = a[i].length - 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printBottomLeft(int[][] a) {
        System.out.println("\nBottom to Top & Left to Right:");
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printBottomRight(int[][] a) {
        System.out.println("\nBottom to Top & Right to Left:");
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = a[i].length - 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int sumOfAllRows(int[][] a) {
        int total_sum = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
            total_sum += sum;
        }
        return total_sum;
    }

    static int sumOfAllColumns(int[][] a) {
        int total_sum = 0;
        for (int j = 0; j < a[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + sum);
            total_sum += sum;
        }
        return total_sum;
    }

    static int sumOfDiagonal(int[][] a) {
        int n = a.length;
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += a[i][i];
            sum2 += a[i][n - 1 - i];
        }

        System.out.println("Main Diagonal Sum: " + sum1);
        System.out.println("Secondary Diagonal Sum: " + sum2);

        int diagonal_sum = sum1 + sum2;

        if (n % 2 != 0) {
            diagonal_sum -= a[n / 2][n / 2];
        }

        return diagonal_sum;
    }
}

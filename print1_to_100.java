public class print1_to_100 {

    public static void main(String[] args) {
        printNumber(1, 100);
    }

    public static void printNumber(int current, int n) {
        if (current > n) return;
        System.out.print(current + " ");
        printNumber(current + 1, n); 
    }
}

import java.util.Arrays;

public class assignment_lar_small {

    public static void main(String[] args) {
        int a[] = {234, 2814, 316, 721, 15, 14};
        int res[] = new int[a.length];

        System.out.println("Original Array: " + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            res[i] = sumOfLarSmall(a[a.length - 1 - i]);
        }

        System.out.println("Reversed Result Array (max+min): " + Arrays.toString(res));
        for(int i=0;i<a.length;i++){
            for(int j=1;j<=res[i];j++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }

    public static int sumOfLarSmall(int num) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (num > 0) {
            int dig = num % 10;
            if (dig > max) max = dig;
            if (dig < min) min = dig;
            num = num / 10;
        }

        return max + min;
    }
}

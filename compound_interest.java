import java.util.*;
public class compound_interest {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the principal amount:");
        double principal=sc.nextDouble();

        System.out.println("Enter the rate of interest:");
        double rate=sc.nextDouble();

        System.out.println("Enter the Time period:");
        double time=sc.nextDouble();

        double amount = principal * Math.pow((1 + (rate / 100)), time);
        double ci=amount-principal;
        System.out.println("Compound Interest:"+ci);

    }
}

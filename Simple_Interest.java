import java.util.Scanner;

public class Simple_Interest {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter The Principal Amount:");
        double principal=sc.nextDouble();
        System.out.println("Enter Rate of Interest:");
        double interest=sc.nextDouble();
        System.out.println("Enter the Year");
        double year=sc.nextDouble();
        double SI=(principal*interest*year)/100;
        System.out.println("Simple Interest:"+SI);
        double total=SI+principal;
        System.out.println("Total Amount:"+total);
    }
}

import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Celsius:");
        double t=sc.nextDouble();
        double f=t*(9.0/5.0)+32;
        System.out.println("Fahrenheit:"+f);
    }
}

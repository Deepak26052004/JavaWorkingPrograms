import java.util.Scanner;

public class Fahrenheit_to_Celsius {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Fahrenheit:");
        double f=sc.nextDouble();
        double t=(f-32)*(5.0/9.0);
        System.out.println("Celsius:"+t);
    }
}

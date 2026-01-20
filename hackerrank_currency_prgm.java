import java.util.*;
import java.text.*;

public class hackerrank_currency_prgm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        // User-defined variable names for Locales
        Locale indiaLoc = new Locale("en", "IN");
        Locale usLoc = Locale.US;
        Locale chinaLoc = Locale.CHINA;
        Locale franceLoc = Locale.FRANCE;

        // User-defined variable names for NumberFormat
        NumberFormat indiaCur = NumberFormat.getCurrencyInstance(indiaLoc);
        NumberFormat usCur = NumberFormat.getCurrencyInstance(usLoc);
        NumberFormat chinaCur = NumberFormat.getCurrencyInstance(chinaLoc);
        NumberFormat franceCur = NumberFormat.getCurrencyInstance(franceLoc);

        // Print payment in different currencies
        System.out.println("US: " + usCur.format(payment));
        System.out.println("India: " + indiaCur.format(payment));
        System.out.println("China: " + chinaCur.format(payment));
        System.out.println("France: " + franceCur.format(payment));
    }
}

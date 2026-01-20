import java.util.*;

public class mini_program {
    static Scanner sc = new Scanner(System.in);
    static int num1, num2, res;

    public static void main(String[] args) {
        while (true) {  // continuous loop
            System.out.println("\n===== MINI PROGRAM MENU =====");
            System.out.println("1. Prime Number");
            System.out.println("2. Factorial");
            System.out.println("3. Armstrong Number");
            System.out.println("4. Perfect Number");
            System.out.println("5. Palindrome");
            System.out.println("6. Fibonacci Series");
            System.out.println("7. Sum of Digits");
            System.out.println("8. Reverse a Number");
            System.out.println("9. Strong Number");
            System.out.println("10. Count Digits");
            System.out.println("11. Neon Number");
            System.out.println("12. Happy Number");
            System.out.println("13. Xylem Number");
            System.out.println("14. Print Tables");
            System.out.println("15. XpowN");
            System.out.println("16. Check Leap Year");
            System.out.println("17. Harshad Number");
            System.out.println("18. Spy Number");
            System.out.println("19. Automorphic Number");
            System.out.println("20. Trimorphic Number");
            System.out.println("21. Evil Number");
            System.out.println("22. Buzz Number");
            System.out.println("23. Duck  Number");
            System.out.println("24. Exit");
            
            System.out.print("Select Your Option: ");
            
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextInt();
                    if (primeNumber(num1))
                        System.out.println(num1 + " is a Prime Number");
                    else
                        System.out.println(num1 + " is not a Prime Number");
                    break;

                case 2:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextInt();
                    res = factorial(num1);
                    System.out.println("Factorial of " + num1 + " is: " + res);
                    break;

                case 3:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextInt();
                    if (isArmstrong(num1))
                        System.out.println(num1 + " is an Armstrong Number");
                    else
                        System.out.println(num1 + " is not an Armstrong Number");
                    break;

                case 4:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextInt();
                    if (isPerfect(num1))
                        System.out.println(num1 + " is a Perfect Number");
                    else
                        System.out.println(num1 + " is not a Perfect Number");
                    break;

                case 5:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextInt();
                    if (isPalindrome(num1))
                        System.out.println(num1 + " is a Palindrome Number");
                    else
                        System.out.println(num1 + " is not a Palindrome Number");
                    break;

                case 6:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextInt();
                    System.out.println("Fibonacci Series of " + num1 + " is:");
                    fibonacciSeries(num1);
                    break;

                case 7:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextInt();
                    res = sumOfDigits(num1);
                    System.out.println("Sum of digits of " + num1 + " is: " + res);
                    break;

                case 8:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextInt();
                    res = revNumber(num1);
                    System.out.println("Reverse of " + num1 + " is: " + res);
                    break;

                case 9:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextInt();
                    if (isStrong(num1))
                        System.out.println(num1 + " is a Strong Number");
                    else
                        System.out.println(num1 + " is not a Strong Number");
                    break;

                case 10:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextInt();
                    res = countDigits(num1);
                    System.out.println("Total digits of " + num1 + " is: " + res);
                    break;

                case 11:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextInt();
                    if (neonNumber(num1))
                        System.out.println(num1 + " is a Neon Number");
                    else
                        System.out.println(num1 + " is not a Neon Number");
                    break;

                case 12:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextInt();
                    if (happyNumber(num1))
                        System.out.println(num1 + " is a Happy Number");
                    else
                        System.out.println(num1 + " is not a Happy Number");
                    break;

                case 13:
                    System.out.print("Enter the number: ");
                    num1 = sc.nextInt();
                    if (sumOfFl(num1) == sumOfMid(num1))
                        System.out.println(num1 + " is a Xylem Number");
                    else
                        System.out.println(num1 + " is not a Xylem Number");
                    break;
                case 14:
                    System.out.println("Enter Starting Number:");
                    num1=sc.nextInt();
                    System.out.println("Enter Ending Number:");
                    num2=sc.nextInt();
                    for(int i=num1;i<=num2;i++){
                        System.out.println("Multplication Table for"+i+" is :");
                        printTables(i,1);
                    }
                    break;
                case 15:
                    System.out.println("Enter X:");
                    num1=sc.nextInt();
                    System.out.println("Enter N:");
                    num2=sc.nextInt();
                    res=xPowN(num1,num2);
                    System.out.println(num1+" power of "+num2+" is: "+res);
                    break;
                case 16:
                    System.out.println("Enter the year:");
                    num1=sc.nextInt();
                    if(leapYear(num1)){
                        System.out.println(num1+" is a Leap year");
                    }
                    else{
                        System.out.println(num1+" is not a Leap year");
                    }
                    break;
                case 17:
                   System.out.println("Enter the number:");
                   num1=sc.nextInt();
                   res=sumOfDigits(num1);
                   if(num1%res==0){
                     System.out.println(num1+" is a Harshad Number");
                   }
                   else{
                    System.out.println(num1+" is not a Harshad Number");
                   }
                   break;
                
                case 18:
                   System.out.println("Enter the number:");
                   num1=sc.nextInt();
                   if(sumOfDigits(num1)==productOfDigits(num1)){
                    System.out.println(num1+" is a Spy Number");
                   }
                   else{
                    System.out.println(num1+" is not a Spy Number");
                   }
                   break;
                
                case 19:
                    System.out.println("Enter the number:");
                    num1=sc.nextInt();
                    if(autoMorphic(num1)){
                        System.out.println(num1+" is a automorphic number");
                    }
                    else{
                        System.out.println(num1+" is not a automorphic number");
                    }
                    break;
                case 20:
                    System.out.println("Enter the number:");
                    num1=sc.nextInt();
                    if(autoMorphic(num1)){
                        System.out.println(num1+" is a Trimorphic number");
                    }
                    else{
                        System.out.println(num1+" is not a Trimorphic number");
                    }
                    break;
                case 21:
                    System.out.println("Enter the number:");
                    num1=sc.nextInt();
                    if(evil(num1)){
                        System.out.println(num1+" is a Evil number");
                    }
                    else{
                        System.out.println(num1+" is not a Evil number");
                    }
                    break;
                case 22:
                    System.out.println("Enter the number:");
                    num1=sc.nextInt();
                    if(buzzNumber(num1)){
                        System.out.println(num1+" is a Buzz number");
                    }
                    else{
                        System.out.println(num1+" is not a Buzz number");
                    }
                    break;

                case 23:
                    System.out.println("Enter the number:");
                    num1=sc.nextInt();
                    if(duckNumber(num1)){
                        System.out.println(num1+" is a Duck number");
                    }
                    else{
                        System.out.println(num1+" is not a Duck number");
                    }
                    break;


                case 24:
                    System.out.println("Thank you! Exiting...");
                    return; 

                default:
                    System.out.println("Invalid Option! Try Again.");
            }
        }
    }

    public static boolean primeNumber(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = n; i >= 2; i--)
            res *= i;
        return res;
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrong(int num) {
        int temp = num, sum = 0;
        int digits = countDigits(num);
        while (temp > 0) {
            sum += Math.pow((temp % 10), digits);
            temp /= 10;
        }
        return num == sum;
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++)
            if (num % i == 0) sum += i;
        return sum == num;
    }

    public static int revNumber(int num) {
        int rev = 0;
        while (num > 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) {
        return revNumber(num) == num;
    }

    public static void fibonacciSeries(int num) {
        int first = 0, second = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }

    public static int productOfDigits(int num) {
        int sum = 1;
        while (num > 0) {
            sum *= (num % 10);
            num /= 10;
        }
        return sum;
    }

    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (n > 0) {
            sum += factorial(n % 10);
            n /= 10;
        }
        return temp == sum;
    }

    public static boolean neonNumber(int n) {
        int sum = 0, square = n * n;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    public static boolean happyNumber(int n) {
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static int sumOfFl(int num) {
        int fl = 0;
        fl += num % 10;
        while (num >= 10) num /= 10;
        fl += num;
        return fl;
    }

    public static int sumOfMid(int num) {
        int mid = 0;
        num /= 10;
        while (num >= 10) {
            mid += num % 10;
            num /= 10;
        }
        return mid;
    }
    public static void printTables(int num,int i){
        if(i<=10){
            System.out.println(num+"*"+i+"="+(num*i));
            i++;
            printTables(num,i);
        }
        return;
    }
    public static int xPowN(int x,int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=x;
        }
        return ans;
    }
    public static boolean leapYear(int year){
        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean autoMorphic(int num){
        long square=(long)num*num;
        long res=square % (long)Math.pow(10,countDigits(num));
        return res==num;
    }
    public static boolean triMorphic(int num){
        long cube=(long)num*num*num;
        long res=cube % (long)Math.pow(10,countDigits(num));
        return res==num;
    }
    public static boolean evil(int n) {
    int count = 0;
    while (n > 0) {
        if (n % 2 == 1) count++;
        n /= 2;
    }
    return count % 2 == 0;
}
    public static boolean buzzNumber(int n){
        if(n%7==0||n%10==7) return true;
        else return false;
    }
    public static boolean duckNumber(int n){
        int firstDigit = n;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        if (firstDigit == 0) return false;
        int temp=n;
        while (temp>firstDigit) {
            if(temp%10==0) return true;
            temp/=10;  
        }
        return false; 
    }

}

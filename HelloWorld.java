import java.util.*;;
public class HelloWorld {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Your Number:");
        int num=sc.nextInt();
        if(sumOfFirstLast(num)==sumOfMiddle(num))
        {
            System.out.println(num+" is a Xylem Number");
        }
        else{
            System.out.println(num+" is not a Xylem Number");
        }
    }
    public static int sumOfFirstLast(int num)
    {
        int fl=0;
        fl+=num%10;
        while (num>=10) {
            num/=10;
        }
        fl+=num;
        return fl;
    }
    public static int sumOfMiddle(int num)
    {
        int mid=0;
        int temp=num;
        temp/=10;
        while (temp>=10) {
            mid+=temp%10;
            temp/=10;
        }
        return mid;   
    }
}

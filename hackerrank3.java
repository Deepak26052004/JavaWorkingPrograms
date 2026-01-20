import java.util.*;;
public class hackerrank3 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int serial_number=1;
        while(sc.hasNextLine())
        {
            String str=sc.nextLine();
            System.out.println(serial_number+" "+str);
            serial_number++;
        }
    }
}
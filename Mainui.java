import java.util.*;
class Mainui 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args){
		Admin admin=new Admin();
		Aadhar_portal portal=new Aadhar_portal();
		boolean flag=true;
		do
		{
			System.out.println("=====Admin Portal======");
			System.out.println("1.Signup");
			System.out.println("2.Login");
			System.out.println("3.Forget Credentials");
			System.out.println("4.Exit");
			System.out.println("Select Your Choice:");
			int choice=sc.nextInt();
			switch(choice){
				case 1 ->
					admin.signup();
				case 2 ->{
					if(admin.login()){
						portal.home();
					}
				}
				case 3 ->
					admin.forgetCreden();
				case 4 ->
				{
					System.out.println("Thank You!!!");
					flag=false;
				}
			}
		}while(flag);
	}
}
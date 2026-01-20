import java.util.*;
class Admin 
{
	int uid,pwd;
	long contact;
	boolean acc_exists;
	static Scanner sc=new Scanner(System.in);
	
	public void signup(){
		if(acc_exists) System.out.println("Account Already Exists, you just login with userId and Pwd");
		else{
			System.out.println("Create Your User Id:");
			uid=sc.nextInt();
			System.out.println("Create Your Password:");
			pwd=sc.nextInt();
			System.out.println("Enter Your Contact Number:");
			contact=sc.nextLong();
			acc_exists=true;
			System.out.println("Successfully Account was Created!!!");
		}
	}
	
	public boolean login(){
		if(acc_exists){
			System.out.println("Enter User Id:");
			int user_id=sc.nextInt();
			
			System.out.println("Enter Password:");
			int user_pwd=sc.nextInt();
			
			if(user_id==uid && user_pwd==pwd){
				System.out.println("Login Successfull");
				return true;
			}
			else{
				System.out.println("Login Failed Please Enter correct userid and password");
			}
		}
		else{
			System.out.println("Create Account to login");}
			return false;
	}
	
	public void forgetCreden(){
		if(acc_exists){
			if(doVerification())
			{
				System.out.println("Enter New User Id:");
				uid=sc.nextInt();
				System.out.println("Enter New Password:");
				pwd=sc.nextInt();
				System.out.println("Enter New Contact:");
				contact=sc.nextLong();
				System.out.println("Profile Updated!!!");
			}
			else{
				System.out.println("Verification Failed!!!");
			}
		}
		else{
			System.out.println("First create account after you can access this feature");
		}
	}
	
	public boolean doVerification(){
		System.out.println("Hello Enter Your Registered Mobile Number:");
		long entered_contact=sc.nextLong();
		if(entered_contact==contact){
			int otp=(int)(Math.random()*9999+9999);
			System.out.println("OTP:"+otp);
			System.out.println("Enter Here:");
			int user_otp=sc.nextInt();
			if(otp==user_otp) return true;
		}
		return false;
	}
	
}

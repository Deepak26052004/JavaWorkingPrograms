import java.util.*;
class Aadhaar
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// Array Storing for usernames,password and contact
		ArrayList<String> usernames=new ArrayList<>();
		ArrayList<String> passwords=new ArrayList<>();
		ArrayList<String> contacts=new ArrayList<>();
		
		boolean exit=false;
		
		while(!exit){
			System.out.println(" ==========Menu==========");
			System.out.println("1.Signup");
			System.out.println("2.Login");
			System.out.println("3.Exit");
			System.out.println("Enter Your Choice:");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice){
				
				case 1:
					System.out.println("*****SignUp*****");
				    System.out.println("Enter Username:");
					String uname=sc.nextLine();
					
					if(usernames.contains(uname)){
						System.out.println("Sorry! This Username already exists!! Try Another Username");
						break;
					}
					
					System.out.println("Enter Password:");
					String upass=sc.nextLine();
					
					usernames.add(uname);
					usernames.add(upass);
					System.out.println("? Signup successful for " +uname+ "!");
					break;
			}
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
	}
}

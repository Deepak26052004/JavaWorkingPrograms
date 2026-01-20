class InstaObj 
{
	public static void main(String[] args) 
	{
		Instagram acc1=new Instagram("Deepak",850,350,"26-05-2004",1234);
		Instagram acc2=new Instagram("Akshaya",350,200,"02-01-2010",4321);
		System.out.println("Before Updation:");
		System.out.println("Account Details:");
		System.out.println("User Name:"+acc1.username);
		System.out.println("Following:"+acc1.following);
		System.out.println("Followers:"+acc1.followers);
		System.out.println("Date of birth:"+acc1.getDob());
		System.out.println("Password:"+acc1.getPwd());
		System.out.println("********************************");
		System.out.println("Account Details:");
		System.out.println("User Name:"+acc2.username);
		System.out.println("Following:"+acc2.following);
		System.out.println("Followers:"+acc2.followers);
		System.out.println("Date of birth:"+acc2.getDob());
		System.out.println("Password:"+acc2.getPwd());
		System.out.println("********************************");
		System.out.println("After Updation:");
		System.out.println("Account Details:");
		System.out.println("User Name:"+acc1.username);
		System.out.println("Following:"+acc1.following);
		System.out.println("Followers:"+acc1.followers);
		acc1.setDob("26-May-2004");
		System.out.println("Date of birth:"+acc1.getDob());
		acc1.setPwd(4567);
		System.out.println("Password:"+acc1.getPwd());
		System.out.println("********************************");
		System.out.println("Account Details:");
		System.out.println("User Name:"+acc2.username);
		System.out.println("Following:"+acc2.following);
		System.out.println("Followers:"+acc2.followers);
		acc2.setDob("02-Jan-2010");
		System.out.println("Date of birth:"+acc2.getDob());
		acc2.setPwd(7890);
		System.out.println("Password:"+acc2.getPwd());
		
		
		
		
	}
}

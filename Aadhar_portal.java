import java.util.*;
class Aadhar_portal 
{
	Aadhar card1= new Aadhar("Deepak","Villupuram",9025880251L,432222482343L);
	Aadhar card2=new Aadhar("Rachin","Bangalore",9876543210L,233445678998L);
	Aadhar card3=new Aadhar("Devon","Newzealand",8754219865L,898745651232L);
		
	Aadhar cards[]={card1,card2,card3};
	static Scanner sc=new Scanner(System.in);
	
	public void home(){
		boolean flag=true;
		do{
			System.out.println("Welcome To Aadhaar Portal!!!!");
			System.out.println("1.Get Info()");
			System.out.println("2.Set Info()");
			System.out.println("3.Exit");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			switch(choice){
				case 1->getInfo();
				case 2->setInfo();
				case 3->flag=false;
			}
		}while(flag);
		System.out.println("Redirecting to Admin Page!!!");
	}
	
	public void getInfo(){
		boolean flag=true;
		do{
			System.out.println("Get Information");
			int choice=show();
			switch(choice+1){
				case 1->getUser(cards[choice]);
				case 2->getUser(cards[choice]);
				case 3->getUser(cards[choice]);
				case 4->{
					System.out.println("Redirecting to Home Page!!!");
					return;
				}
			}
		}while(flag);
	}
	
	public int show(){
		for(int i=0;i<cards.length;i++){
			System.out.println((i+1)+"."+cards[i].getName());
		}
		System.out.println((cards.length+1)+".Exit");
		System.out.print("Enter Here:");
		return sc.nextInt()-1;
	}
	
	public void setInfo(){
		boolean flag=true;
		do{
			System.out.println("Set Information");
			int choice=show();
			switch(choice+1){
				case 1->setUser(cards[choice]);
				case 2->setUser(cards[choice]);
				case 3->setUser(cards[choice]);
				case 4->{
					System.out.println("Redirecting to Home Page!!!");
					return;
				}
			}
		}while(flag);
	}
	
	public void getUser(Aadhar card) {
    boolean flag = true;
    do {
        System.out.println("Get the details of: " + card.getName());
        System.out.println("1.Location\n2.Contact\n3.Aadhaar Card Number\n4.Exit");
        int enter = sc.nextInt();
        switch (enter) {
            case 1 -> System.out.println("Location: " + card.getLoc());
            case 2 -> System.out.println("Contact: " + card.getContact());
            case 3 -> System.out.println("Aadhaar Number: " + card.getAnumber());
            case 4 -> flag = false;
        }
    } while (flag);
    System.out.println("Redirecting to Information Page");
}

	
	public void setUser(Aadhar card) {
    boolean flag = true;
    do {
        System.out.println("Set the details of: " + card.getName());
        System.out.println("1.Name\n2.Location\n3.Contact\n4.Exit");
        int enter = sc.nextInt();
        switch (enter) {
            case 1 -> {
                System.out.println("Enter New Name:");
                String new_name = sc.next();
                card.setName(new_name);
            }
            case 2 -> {
                System.out.println("Enter New Location:");
                String new_loc = sc.next();
                card.setLoc(new_loc);
            }
            case 3 -> {
                System.out.println("Enter New Contact:");
                long new_contact = sc.nextLong();
                card.setContact(new_contact);
            }
            case 4 -> flag = false;
        }
    } while (flag);
    System.out.println("Redirecting to Set Information Page");
}

			
}

class Deepak
{
	public static void main(String[] args) 
	{
		Room3 r3=new Room3();
		System.out.println("Before Setting:");
		System.out.println(r3.getDeepak());
		System.out.println(r3.m);
		System.out.println(r3.o);
		System.out.println(r3.p);
		r3.setDeepak(100,400,500,600);
		System.out.println("After Setting:");
		System.out.println(r3.getDeepak());
		System.out.println(r3.m);
		System.out.println(r3.o);
		System.out.println(r3.p);
		
	}
}

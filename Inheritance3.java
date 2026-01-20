class Inheritance 
{
	static int x=10;
	public static void  m1(){
		System.out.println("Class 1 Printing");
	}
}

class Inheritance2 extends Inheritance
{
	static int y=20;
	public static void m2(){
		System.out.println("Class 2 Printing");
	}
	public static void main(String [] args){
		System.out.println(x);
		m1();
		
	}
}

class Inheritance3 extends Inheritance2
{
	static int z=30;
	public static void m3(){
		System.out.println("Class 3 Printing");
	}
	public static void main(String [] args){
		System.out.println(x);
		m1();
		System.out.println(y);
		m2();
		System.out.println(z);
		m3();
		
	}
}

class Car 
{
	String name,color;
	double price;
	Engine e=new Engine();
	
	Car(String name,String color,double price){
		this.name=name;
		this.color=color;
		this.price=price;
	}
	
	public void detailsOfCar(){
		System.out.println("Car Details!!!");
		System.out.println("Car Name:"+name);
		System.out.println("Car Color:"+color);
		System.out.println("Car Price:"+price);
		System.out.println("************************************************");
	}
}

class Car1
{
	String name,color;
	double price;
	Engine1 e;
	
	Car1(String name,String color,double price,Engine1 e){
		this.name=name;
		this.color=color;
		this.price=price;
		this.e=e;
	}
	
	public void detailsOfCar(){
		System.out.println("Car Details!!!");
		System.out.println("Car Name:"+name);
		System.out.println("Car Color:"+color);
		System.out.println("Car Price:"+price);
		e.detailsOfEngine1();
		System.out.println("************************************************");
	}
}

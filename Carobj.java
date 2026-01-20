class Carobj 
{
	public static void main(String[] args) 
	{
		Car c1=new Car("Maaruthi","White",7200000);
		Car c2=new Car("BMW","Black",76200000);
		Car c3=new Car("Suzuki","Red",200000);
		System.out.println("Car1 Details");
		c1.detailsOfCar();
		c1.e.detailsOfEngine();
		System.out.println("Car2 Details");
		c2.detailsOfCar();
		c2.e.detailsOfEngine();
		System.out.println("Car3 Details");
		c3.detailsOfCar();
		c3.e.detailsOfEngine();
	}
}

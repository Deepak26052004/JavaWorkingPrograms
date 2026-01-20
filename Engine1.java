class Engine1
{
	String cc,power,type;
	int stroke;
	
	Engine1(String cc,String power,String type,int stroke){
		this.cc=cc;
		this.power=power;
		this.type=type;
		this.stroke=stroke;
	}
	public void detailsOfEngine1(){
		System.out.println("Engine Details");
		System.out.println("Engine CC:"+cc);
		System.out.println("Engine Power:"+power);
		System.out.println("Engine Stroke:"+stroke);
		System.out.println("Engine Type:"+type);
	}
}

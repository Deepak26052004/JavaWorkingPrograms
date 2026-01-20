class Student1 
{
	private int sid;
	private String sname;
	
	private Student1(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
	
	public int getSid(){
		return sid;
	}
	public String getSname(){
		return sname;
	}
	
	public static Student1 getStudent1Obj(int sid,String sname){
		return new Student1(sid,sname);
	}
}

class Instagram
{
	public String username;
	int following;
	public int followers;
	private String dob;
	private int pwd;
	
	public Instagram(String username,int following,int followers,String dob,int pwd){
		this.username=username;
		this.following=following;
		this.followers=followers;
		this.dob=dob;
		this.pwd=pwd;
	}
	
	public String getDob(){
		return dob;
	}
	
	public int getPwd(){
		return pwd;
	}
	
	
	public void setDob(String dob){
		this.dob=dob;
	}
	
	public void setPwd(int pwd){
		this.pwd=pwd;}
	
	
}

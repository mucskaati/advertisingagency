package clients;

public class Client {
	
	
	public String name;

	public Client(String name)
	{
		this.name = name;
	}
	
	
	
	public Work makeWork(String jobs[])
	{
		
		return new Work(jobs,this);
		
	}
	
	
	
}

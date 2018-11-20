package workers;

import clients.Work;

public abstract class Worker {
	
	public String name;
	public String lastname;
	public String position;
	public boolean isWorking;
	public Work actualWork;
	public Team team;
	
	
	public void setWork(Work work)
	{
		this.actualWork = work;
	}
	
	public boolean hasWork()
	{
		return (this.actualWork != null) ? true : false;
	}
	

}

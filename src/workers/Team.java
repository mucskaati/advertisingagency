package workers;
import java.util.LinkedList;
import clients.Work;

public class Team {
	
	public String name;
	private Work actualWork;
	//TODO:: private final int typeOfWorkerInTeam = 1;
	protected boolean actualWorking = false;
	public LinkedList<Worker> workers = new LinkedList<Worker>();
	
	
	public Team(String name)
	{
		this.name = name;
	}
	
	//Add worker to team
	public void addWorkerToTeam(Worker worker)
	{
		workers.add(worker);
	}
	
	
	//Find out if team has certain worker
	public boolean hasWorker(Worker worker)
	{
		
		for (Worker workerInList : workers) {
			
			if(worker.position == workerInList.position )
			{
				return true;
			}
		}
		
		return false;
	}
	
	//Add work to team
	public Work assignWork(Work work)
	{
		return this.actualWork = work; 
	}
	
	//Find out if team is working on the project
	public boolean isWorkingOnProject()
	{
		return (this.actualWork != null) ? true : false;
	}
	
	
	//--------------------Protected and Private methods--------------------------------------------
	
	protected Worker findWorker(String type)
	{
		for (Worker worker : this.workers) {
			
			if(worker.position == type)
			{
				return worker;
			}
		}
		return null;
	}

}

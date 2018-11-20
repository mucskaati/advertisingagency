package workers;

import java.util.LinkedList;
import clients.*;

public class Account extends Worker{
	
	protected Team team;
	
	public LinkedList<Client> clients = new LinkedList<Client>();
	
	public Account(String name, String lastname, String position)
	{
		this.name = name;
		this.lastname = lastname;
		this.position = position;
	}
	
	
	public void addWorkToTeamMembers()
	{
		String jobs[] = this.actualWork.jobs;
		
		for(int i = 0; i < jobs.length; i++)
		{
			this.findOutNeededWorkers(jobs[i]);
			
		}
	}
	
	//------------------------------ Protected and Private methods -------------------------------
	protected LinkedList<Worker> findOutNeededWorkers(String job)
	{ 
		LinkedList<Worker> workers = new LinkedList<Worker>();
		
		if(job == "website")
		{
			//TODO:: Zisti ci robotnik nema aktualne robotu az potom pridaj do zoznamu
			workers.add(this.team.findWorker("graphic"));
			workers.add(this.team.findWorker("programmer"));
			
		}
		
		return workers;
	}
	
}

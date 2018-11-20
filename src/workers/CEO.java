package workers;

import java.util.LinkedList;
import clients.Work;

public class CEO extends Worker {
	
	protected LinkedList<Worker> allMyWorkers;

	public CEO(String name, String lastname)
	{
		this.name = name;
		this.lastname = lastname;
	}
	
	public void createTeams() 
	{
		//Create teams and add worker
		Team team1 = new Team("Genials");
		Team team2 = new Team("Brutalers");
				
		for (Worker worker : this.allMyWorkers)
		{
			//Add worker to certain team
			if(!team1.hasWorker(worker)) {
							
				team1.addWorkerToTeam(worker);
				worker.team = team1;
				
				System.out.println("CEO pridal pracovnika do tímu " + team1.name);
							
			} else if(!team2.hasWorker(worker)) {
							
				team2.addWorkerToTeam(worker);
				worker.team = team2;
				System.out.println("CEO pridal pracovnika do tímu " + team2.name);
							
			} else {
				System.out.println("Tímy sú plné. Treba vytvoriť nový tím");
				//TODO: vytvor novy team
			}
		}
		
		//Vypis tim
		this.showTeam(team1);	
		
			
	}
	
	public void setWorkers(LinkedList<Worker> allWorkers)
	{
		this.allMyWorkers = allWorkers;
	}
	
	public void setWork()
	{
		System.out.println("CEO by nemal robiť nič!");
	}
	
	
	public void setWorkToAccountant(Work work)
	{
		for (Worker worker : this.allMyWorkers)
		{
			if(worker.position == "account" && !worker.isWorking)
			{
				worker.actualWork = work;
				System.out.println("Accountakovi " + worker.name + " CEO priradil pracu od firmy "+ work.client.name +" rozdelit robotu do jeho timu.");
				break;
			}
			
		}
	}
	
	
	//------------------------------------ Protected Methods ---------------------------------
	
	protected void showTeam(Team team)
	{
		System.out.println("Tím " + team.name +" pracovnici:");
		for (Worker worker : team.workers) 
		{
				System.out.println(worker.lastname);
		}	
	}
	
}

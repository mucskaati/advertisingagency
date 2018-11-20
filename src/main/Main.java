package main;
import java.util.LinkedList;
import workers.*;
import clients.*;
import static helpers.ArrayHelper.*;

public class Main {
	public static void main(String[]args) 
	{
		//Creating company with list of all workers
		CEO newCeo = new CEO("Jozo", "Mrkva");
		Client client1 = new Client("Ikea");
		Client client2 = new Client("Krušovice");
		LinkedList<Worker> allWorkers = new LinkedList<Worker>();
		
		//Designer
		Designer graphic1 = new Designer("Laco", "Designer","designer");
		Designer graphic2 = new Designer("Lorem2", "Ipsum2", "designer");
		//Marketer
		Marketer marketer1 = new Marketer("Laco", "Marketer","marketer");
		Marketer marketer2 = new Marketer("Laco", "marketer", "marketer");
		//Programmers
		Programmer programmer1 = new Programmer("Laco", "Programmer","programmer");
		Programmer programmer2 = new Programmer("Lorem4", "Ipsum4","programmer");
		//Account
		Account account1 = new Account("Lorem3", "Account","account");
		Account account2 = new Account("Lorem4", "Ipsum4", "account");
		
		//Na demonstraciu ze su timy plne
		//Worker account3 = new Account("Lorem4", "Ipsum4", "account");
		
		//Prijimam ich
		allWorkers.add(graphic1);
		allWorkers.add(graphic2);
		allWorkers.add(marketer1);
		allWorkers.add(marketer2);
		allWorkers.add(programmer1);
		allWorkers.add(programmer2);
		allWorkers.add(account1);
		allWorkers.add(account2);
		//allWorkers.add(account3);
		
		newCeo.setWorkers(allWorkers);
		newCeo.createTeams();
		
		//Clienti vytvaraju pracu
		Work w1 = client1.makeWork(arr("website", "social"));
		Work w2 = client2.makeWork(arr("website"));
		Work w3 = client2.makeWork(arr("poster"));
		
		newCeo.setWorkToAccountant(w1);
		account1.addWorkToTeamMembers();
		
		
		
		
		
		
		
	}

}

package MovieReservationSystem;
import java.util.Scanner;

public class Movie {
	private String name;
	private String theaterName;
	private int numberOfTickets;
	private int cost;
	
	Movie(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the movie: ");
		this.name = sc.nextLine();
		System.out.println("Enter the theaters name: ");
		this.theaterName = sc.nextLine();
		System.out.println("Enter the number of tickets: ");
		this.numberOfTickets = sc.nextInt();
		System.out.println("Enter the cost per ticket");
		this.cost = sc.nextInt();	
	}
	void setname(String name) {
		this.name = name;
	}
	String getname() {
		return name;
	}
	
	void settheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	String gettheaterName() {
		return theaterName;
	}
	
	void setnumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}
	int getnumberOfTickets() {
		return numberOfTickets;
	}
	
	void setcost(int cost) {
		this.cost = cost;
	}
	int getcost() {
		return cost;
	}
	
	void storeAllDetails(String name, String theaterName, int numberOfTickets, int cost) {
		this.name = name;
		this.theaterName = theaterName;
		this.numberOfTickets = numberOfTickets;
		this.cost = cost;
	}
	
	void viewAllDetails() {
		System.out.println("Movie Title: " + name);
		System.out.println("Cinema Name: " + theaterName);
		System.out.println("Number of Tickets: " + numberOfTickets);
		System.out.println("Cost of the Ticket: " + cost);
	}
	
}

package MovieReservationSystem;
import java.util.Scanner;

public class Movie1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int status = 1;
        Movie movielist[] = null;
        do {
        	System.out.println("Welcome to Cinema Hall");
        	System.out.println("1. Add Movie Details");
        	System.out.println("2. Search and Book");
        	System.out.println("3. View All");
        	System.out.println("Enter your choice: ");
        	int choice = sc.nextInt();
        	
        	switch(choice) {
        	case 1: 
        			System.out.println("Enter number of movies: ");
        			int numOfMovies = sc.nextInt();
        			movielist = new Movie[numOfMovies];
        			for(int i=0;i<movielist.length;i++) {
        				int j=i+1;
        				System.out.println("Enter movie " + j + " Details");
        				movielist[i]=new Movie();
        			}
        			System.out.println("Data Saved.");
        			break;
        			
        	case 2:
        			boolean movieFound = true;
        			sc.nextLine();
        			System.out.println("Enter the movie name: ");
        			String name = sc.nextLine();
        			for(int i=0;i<movielist.length;i++) {
        				if(movielist[i].getname().equals(name)) {
        					movielist[i].viewAllDetails();
        					movieFound = true;
        					System.out.println("Would you like to book tickets for this movie? ");
        					System.out.println("Enter 1 to book or 2 to exit. ");
        					int choiceToBook = sc.nextInt();
        					if(choiceToBook == 1) {
        						System.out.println("Enter the number of Tickets: ");
        						int numberTicketToBook = sc.nextInt();
        						int totalBill = movielist[i].getcost() * numberTicketToBook;
        						System.out.println("Total Bill: " + totalBill);
        						break;
        					}
        					else
        						break;
        				}
        				else
        					movieFound = false;
        			}
        			if(movieFound == false)
        				System.err.println("Movie Not Found");    
        			break;
        			
        	case 3: 
        			for(int i=0;i<movielist.length;i++) {
        				movielist[i].viewAllDetails();
        			}
        			break;
        		
        	default: System.out.println("Wrong Choice");
        	}
        	
        	System.out.println("Do you want to continue(1.yes / 2.no): ");
        	status= sc.nextInt();
        }while(status==1);
	}

}

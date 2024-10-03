package ticketsystem;
import java.util.Scanner;
public class TicketSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		    
		        int numberOfTickets;
	      
		        System.out.println("Enter the number of tickets to issue:");
		        numberOfTickets = scanner.nextInt();
		        
		        for (int i = 1; i<= numberOfTickets; i++) {
		        	System.out.println("Ticket " + i + "issued.");
		        }
		        
		        
	}
	
		}
		
	



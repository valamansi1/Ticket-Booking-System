package comm.jsp.Encapsulation;
import java.util.Scanner;

public class BoxOffice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Theatre theatre = new Theatre("INOX",400);
		boolean flag=true;
		while(flag) {
			System.out.println("Enter \n1.Show Number Of Seats Available \n2.Book Tickets \n3.Cancel Ticket \n4.Print Ticket Details \n5.Exit");
			int n=sc.nextInt();
			switch(n) {
			case 1:{
				theatre.showTicketAvailability();
				}break;
			case 2:{
				System.out.println("Enter the movie name");
				String name = sc.next();
				System.out.println("Enter the number of seats you want to book");
				int num=sc.nextInt();
				theatre.setTicket(new Ticket(name,num));
				int booked = theatre.bookTicket();
				if(booked==1) {
					System.out.println("Sorry,number of seats you are trying to book are not available");
				}else {
					System.out.println("Tickets booked successfully");
				}
					}break;
			case 3:{
				System.out.println("Enter the number of tickets to be cancelled");
				int num = sc.nextInt();
				theatre.cancelTicket(num);
					}break;
			case 4: {
				theatre.showTicketDetail();
					}break;
			case 5: {
				flag=false;
					}break;
			default: {
				System.out.println("Invalid choice");
			}
			}
		}
	}
	

}


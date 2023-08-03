package comm.jsp.Encapsulation;

public class Theatre {
	private String Tname;
	private int no_of_seats;
	private Ticket ticket;
	
	public Theatre(String Tname,int no_of_seats) {
		this.Tname=Tname;
		this.no_of_seats=no_of_seats;
	}
	
	public void setTname(String Tname) {
		this.Tname=Tname;
	}
	public String getTname() {
		return Tname;
	}
	
	public void setNO_of_seats(int no_of_seats) {
		this.no_of_seats=no_of_seats;
	}
	public int getNo_of_seats() {
	return no_of_seats;
	}
	
	public void setTicket(Ticket ticket) {
		this.ticket=ticket;
	}
	public Ticket getTicket() {
		return ticket;
	}
	
	public int bookTicket() {
		if(ticket.getNo_of_tickets()<=no_of_seats) {
			no_of_seats=no_of_seats-ticket.getNo_of_tickets();
			return ticket.getNo_of_tickets();
		}
		else
			return -1;
			
	}
	public String cancelTicket(int cancel_ticket) {
		if(cancel_ticket<=ticket.getNo_of_tickets()) {
			ticket.setNo_of_tickets(ticket.getNo_of_tickets()-cancel_ticket);
			no_of_seats=no_of_seats+cancel_ticket;
			return "tickets cancelled successfully";
		}
		else {
			return "tickets cancelling unsuccessful";
			
		}
	}
	
	public void showTicketAvailability() {
		if(no_of_seats>0) {
		System.out.println(no_of_seats+" seats available");
	}
		else {
			System.out.println("Theatre is housefull");
		}
	}
	
	public void showTicketDetail() {
		ticket.printTicketDetails();
	}
}







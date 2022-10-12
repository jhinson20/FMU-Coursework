import java.util.Scanner;
import java.util.Date;
public class URL_Assignment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	}
}
class Destination {
	Date visitDate = new Date();
	double ticketPrice = 0;
	String location = "";
	String hotel = "";
	double roomCost = 0;
	public Destination() {  //Default constructor
	}
	public Destination(Date newVisitDate, double newTicketPrice, String newLocation, String newHotel, double newRoomCost) { //Constructor
		ticketPrice = newTicketPrice;
		location = newLocation;
		hotel = newHotel;
		roomCost = newRoomCost;
		visitDate = newVisitDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String newLocation) {
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String newTicketPrice) {
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String newHotel) {
	}
	public double getRoomCost() {
		return roomCost;
	}
	public void setRoomCost(double newRoomCost) {
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date newVisitDate) {
	}
}
class Vacation {
	public Vacation() {
	}
}
class Tourist {
}
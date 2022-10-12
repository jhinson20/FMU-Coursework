import java.util.*;
import java.io.*;
public class TouristTest {
	public static void main(String[] args) throws java.io.IOException {
		Scanner input = new Scanner(System.in);
		ArrayList<String> touristList = new ArrayList<>();	
		File file = new File(args[0] + ".txt");			
		Scanner fileReader = new Scanner(file);
		String[] touristItems = null;
		while(fileReader.hasNext())touristList.add(fileReader.nextLine());
			fileReader.close();
		for (int i = 0; i < touristList.size(); i++){
			touristItems = touristList.get(i).split(",");
			String touristName = touristItems[0];
			String touristPhone = touristItems[1];
			String touristAddress = touristItems[2];
			System.out.println("\nTourist " + touristName + "'s details imported.\n");
			System.out.println("Enter 'yes' or 'no for the following two questions: ");
			System.out.print("Has " + touristName + " been tested for COVID?: ");
			String testedString = input.nextLine();
			String covidTestDate = "";
			String covidVaccinationDate = "";
			ApprovedTourist approvedTourist = null;
			Tourist tourist = null;
			if (testedString.toUpperCase().equals("YES")) {
				System.out.print("Enter date of COVID test (mm-dd-yyyy): ");
				covidTestDate = input.nextLine();
			}
			System.out.print("Has " + touristName + " been vaccinated for COVID?: ");
			String vaccinatedString = input.nextLine();
			if (vaccinatedString.toUpperCase().equals("YES")) {
				System.out.print("Enter date of COVID vaccination (mm-dd-yyyy): ");
				covidVaccinationDate = input.nextLine();
			}
			if (testedString.toUpperCase().equals("YES") && vaccinatedString.toUpperCase().equals("YES")) {
				approvedTourist = new ApprovedTourist(touristName, touristAddress, touristPhone, covidTestDate, covidVaccinationDate);
			}
			else {
				tourist = new Tourist(touristName, touristAddress, touristPhone);
			}
			System.out.print("\nEnter vacation details.\nEnter Travel Agency: ");
			String touristTravelAgency = input.nextLine();
			System.out.print("Enter Booking Date(mm-dd-yyyy): ");
			String touristBookingDate = input.nextLine();
			Vacation vacation = new Vacation(touristBookingDate, touristTravelAgency);
			int destinationNumListing = 0;
			while (true) {
				System.out.println("\nGetting details for destination " + (1 + destinationNumListing++));
				System.out.println("Enter exit when all destinations are entered");
				System.out.print("Enter date of destination visit (mm-dd-yyyy): ");
				String touristDateOfVisit = input.nextLine();
				if(touristDateOfVisit.equals("exit"))
					break;
				else {
					System.out.print("Enter ticket price: ");
					String touristTicketPrice = input.nextLine();
					System.out.print("Enter destination location: ");
					String touristLocation = input.nextLine();
					System.out.print("Enter destination hotel: ");
					String touristHotel = input.nextLine();
					System.out.print("Enter hotel room cost: ");
					String touristRoomCost = input.nextLine();
					Destination destination1 = new Destination(touristDateOfVisit, Double.parseDouble(touristTicketPrice), touristLocation, touristHotel, Double.parseDouble(touristRoomCost)); 
					vacation.setDestinations(destination1);
				}
			}
			if (testedString.toUpperCase().equals("YES") && vaccinatedString.toUpperCase().equals("YES")) {
				writeApprovedTouristReport(approvedTourist, vacation);
			}
			else {
				writeTouristReport(tourist, vacation);
			}
		}
	}
	static void writeTouristReport(Tourist tourist, Vacation vacation) throws java.io.IOException {
		File file = new File("TouristReport.txt");
		PrintWriter output = new PrintWriter(new FileOutputStream(file, true));
		output.print("\nReport for unapproved tourist " + tourist.getName() + ":\n");
		output.print("Vacation date: " + vacation.getDateOfDeparture() + "\n");
		output.print("Booked with: " + vacation.getTravelAgency() + "\n");
		output.print("Destinations:" + "\n");
		output.print(vacation.getDestinations()); 
		output.close();
	}
	static void writeApprovedTouristReport(ApprovedTourist approvedTourist, Vacation vacation) throws java.io.IOException {
		File file = new File("TouristReport.txt");
		PrintWriter output = new PrintWriter(new FileOutputStream(file, true));
		output.print("\nReport for approved tourist " + approvedTourist.getName() + ":\n");
		output.print("Vacation date: " + vacation.getDateOfDeparture() + "\n");
		output.print("Booked with: " + vacation.getTravelAgency() + "\n");
		output.print("Destinations:" + "\n");
		output.print(vacation.getDestinations());
		output.print("Tested: " + approvedTourist.getCovidTestDate() + "\n");
		output.print("Vaccinated: " + approvedTourist.getCovidVaccinationDate() + "\n");
		output.close();
	}
}
class Destination {
	private String dateOfVisit;
	private double ticketPrice;
	private String location;
	private String hotel;
	private double roomCost;
	static int destNum;
	public Destination() { 
	}
	public Destination(String dateOfVisit, double ticketPrice, String location, String hotel, double roomCost) { 
		this.ticketPrice = ticketPrice;
		this.location = location;
		this.hotel = hotel;
		this.roomCost = roomCost;
		this.dateOfVisit = dateOfVisit;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public double getRoomCost() {
		return roomCost;
	}
	public void setRoomCost(double roomCost) {
		this.roomCost = roomCost;
	}
	public String getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	public String toString() {
		return location + " "  + dateOfVisit;
	}
}
class Vacation {
	private String dateOfDeparture;
	private String travelAgency;
	private Destination[] destination = new Destination[20]; 
	private int destNumber = 0;
	public Vacation(){
	}
	public Vacation(String dateOfDeparture, String travelAgency){
		this.dateOfDeparture = dateOfDeparture;
		this.travelAgency = travelAgency;
	}
	public String getDateOfDeparture(){
		return dateOfDeparture;
	}
	public void setDateOfDeparture(String dateOfDeparture){
		this.dateOfDeparture = dateOfDeparture;
	}
	public String getTravelAgency(){
		return travelAgency;
	}
	public void setTravelAgency(String travelAgency){
		this.travelAgency = travelAgency;
	}
	public String getDestinations(){
		String destinationTemp = "";
		for (int i = 0; i < destNumber; i++) 
			destinationTemp += (i + 1) + ". " + destination[i].toString() + "\n";
		return destinationTemp; 
	}
	public void setDestinations(Destination dest){
		destination[destNumber] = dest;
		destNumber++;
	}
}
class Tourist {
	String name;
	String address;
	String phone;
	private Vacation vacation;
	public Tourist(){ 
	}
	public Tourist(String name, String address, String phone){
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getPhone(){
		return phone;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public Vacation getvacation() {
		return vacation;
	}
	public void setVacation(Vacation vacation) {
		this.vacation = vacation;
	}
}
class ApprovedTourist extends Tourist {
	String covidTestDate;
	String covidVaccinationDate;
	public ApprovedTourist() {
	}
	public ApprovedTourist(String name, String address, String phone, String covidTestDate, String covidVaccinationDate) {
		super(name, address, phone);
		this.covidTestDate = covidTestDate;
		this.covidVaccinationDate = covidVaccinationDate;
	}
	public String getCovidTestDate() {
		return covidTestDate;
	}
	public void setCovidTestDate(String covidTestDate) {
		this.covidTestDate = covidTestDate;
	}
	public String getCovidVaccinationDate() {
		return covidVaccinationDate;
	}
	public void setCovidVaccinationDate(String covidVaccinationDate) {
		this.covidVaccinationDate = covidVaccinationDate;
	}
}
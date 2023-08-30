package classwork;

public class PoliceOfficer {
	
	String name, badge;
	
	public PoliceOfficer() {
		
	}
	public PoliceOfficer(String name, String badge) {
		this.name = name;
		this.badge = badge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBadge() {
		return badge;
	}
	public void setBadge(String badge) {
		this.badge = badge;
	}
	public boolean checkCar(ParkedCar car, ParkingMeter minutes) {
		if (car.getMinutesParked() > minutes.getpMinutes()) {
			return true;
		}
			else {
				return false;
			}
		}
	
    public ParkingTicket createTicket(ParkedCar car, ParkingMeter minutes) {
    	ParkingTicket ticket = new ParkingTicket(car, this, minutes);
    	int MinutesLeft = car.getMinutesParked() - minutes.getpMinutes();
    	
    	if (checkCar(car, minutes) == true) {
    		if (MinutesLeft <= 60) {
    			ticket.ticket = 25;
    		} else {
    			ticket.ticket = 25 + (10 * (MinutesLeft / 60));
    		}
    	}
    	return ticket;
    	
    }
	public ParkingTicket issueParkingTicket(ParkedCar car, ParkingMeter meter) {
		System.out.println("Ticket has been issued.");
		return null;
	}
}






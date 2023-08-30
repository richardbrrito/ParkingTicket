package classwork;

public class ParkingTicket {
	
	private ParkedCar car;
	private PoliceOfficer officer;
	private ParkingMeter parkingMeter;
	double ticket;
	
	public ParkingTicket() {
		
	}
	public ParkingTicket(ParkedCar car, PoliceOfficer officer, ParkingMeter parkingMeter) {
		this.car = car;
		this.officer = officer;
		this.parkingMeter = parkingMeter;
				
	}
	
	public ParkedCar getCar() {
		return car;
	}
	public void setCar(ParkedCar car) {
		this.car = car;
	}
	public PoliceOfficer getOfficer() {
		return officer;
	}
	public void setOfficer(PoliceOfficer officer) {
		this.officer = officer;
	}
	public ParkingMeter getParkingMeter() {
		return parkingMeter;
	}
	public void setParkingMeter(ParkingMeter parkingMeter) {
		this.parkingMeter = parkingMeter;
	}
	
	public String toString() {
		String toString = "License Number: " + car.getLicenseP() + "\nMake:" + car.getMake() +
				"\nModel:" + car.getModel() + "\nColor:" + car.getColor() 
				+ "\nFine: $" + String.format("%.2f", this.ticket) + "\nOfficer" 
				+ officer.getName() + "\nBadge Number: " + officer.getBadge();
		return toString;
				
	}
	public String ticket() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getReason() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

package classwork;
public class ParkingTicketSimulator {
  public static void main(String[] args) {
    // Create a parked car object
    ParkedCar car = new ParkedCar("Honda", "Civic", "Black", 2022, "ABC123", 60);
    System.out.println("Parked Car Info:");
    System.out.println("Make: " + car.getMake());
    System.out.println("Model: " + car.getModel());
    System.out.println("Color: " + car.getColor());
    System.out.println("Year: " + car.getYear());
    System.out.println("License Plate: " + car.getLicenseP());
    System.out.println("Minutes Parked: " + car.getMinutesParked());

    // Create a parking meter object
    ParkingMeter meter = new ParkingMeter(120);
    System.out.println("\nParking Meter Info:");
    System.out.println("Minutes Purchased: " + meter.getpMinutes());

    // Create a police officer object
    PoliceOfficer officer = new PoliceOfficer("Joseph Weathers", "12345");
    System.out.println("\nPolice Officer Info:");
    System.out.println("Name: " + officer.getName());
    System.out.println("Badge Number: " + officer.getBadge());

    // Check if car is parked illegally
    ParkingTicket ticket = officer.issueParkingTicket(car, meter);
    if (ticket != null) {
      System.out.println("\nParking Ticket Issued:");
      System.out.println("Fine: $" + ticket.ticket());
      System.out.println("Reason: " + ticket.getReason());
      System.out.println("Officer Name: " + ticket.getOfficer().getName());
      System.out.println("Officer Badge Number: " + ticket.getOfficer().getBadge());
      System.out.println("Car Make: " + ticket.getCar().getMake());
      System.out.println("Car Model: " + ticket.getCar().getModel());
      System.out.println("Car Color: " + ticket.getCar().getColor());
      System.out.println("Car Year: " + ticket.getCar().getYear());
      System.out.println("Car License Plate: " + ticket.getCar().getLicenseP());
    } else {
      System.out.println("\nNo Parking Ticket Issued. Car is parked legally.");
    }
  }
}

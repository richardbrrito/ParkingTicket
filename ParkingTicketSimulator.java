import java.util.Scanner;
public class ParkingTicketSimulator {
    public static void main(String[] args) {
        // Create a parked car object
        ParkingTicket meter = new ParkingTicket();
        System.out.println("Has the car paid for a ticket?");
        String m

        ParkedCar car = new ParkedCar();
        Scanner carScanner = new Scanner(System.in);
        System.out.println("What is the Car Make?");
        String makeInput = carScanner.nextLine();
        car.setMake(makeInput);
        System.out.println("What is the car Model?");
        String modelInput = carScanner.nextLine();
        car.setModel(modelInput);
        System.out.println("What is the car color?");
        String colorInput = carScanner.nextLine();
        car.setColor(colorInput);
        System.out.println("What is the car year?");
        int yearInput = carScanner.nextInt();
        car.setYear(yearInput);
        System.out.println("What is the License Plate?");
        carScanner.nextLine();
        String licenseInput = carScanner.nextLine();
        car.setLicenseP(licenseInput);
        System.out.println("How long has the car been parked?");
        int minutesInput = carScanner.nextInt();
        car.setMinutesParked(minutesInput);


        System.out.println("Model:" + car.getModel());
        System.out.println("Make:" + car.getMake());
        System.out.println("Color:" + car.getColor());
        System.out.println("Year:" + car.getYear());
        System.out.println("License Plate:" + car.getLicenseP());
        System.out.println("Minutes Parked:" + car.getMinutesParked());


        ParkingMeter meter = new ParkingMeter(120);

        System.out.println(" ");
        System.out.println("How many minutes did the car purchase?");

        System.out.println(" ");
        System.out.println("Minutes Purchased: ");
    }
}




//        ParkedCar car = new ParkedCar("Honda", "Civic", "Black", 2022, "ABC123", 60);
//        System.out.println("Parked Car Info");
//        System.out.println("Make: " + car.getMake());
//        System.out.println("Model: " + car.getModel());
//        System.out.println("Color: " + car.getColor());
//        System.out.println("Year: " + car.getYear());
//        System.out.println("License Plate: " + car.getLicenseP());
//        System.out.println("Minutes Parked: " + car.getMinutesParked());
//
//        // Create a parking meter object
//        ParkingMeter meter = new ParkingMeter(120);
//        System.out.println("\nParking Meter Info");
//        System.out.println("Minutes Purchased: " + meter.getpMinutes());
//
//        // Create a police officer object
//        PoliceOfficer officer = new PoliceOfficer("Joseph Weathers", "12345");
//        System.out.println("\nPolice Officer Info");
//        System.out.println("Name: " + officer.getName());
//        System.out.println("Badge Number: " + officer.getBadge());
//
//        // Check if car is parked illegally
//        ParkingTicket ticket = officer.issueParkingTicket(car, meter);
//        if (ticket != null) {
//            System.out.println("\nParking Ticket Issued");
//            System.out.println("Fine: $" + ticket.ticket());
//            System.out.println("Reason: " + ticket.getReason());
//            System.out.println("Officer Name: " + ticket.getOfficer().getName());
//            System.out.println("Officer Badge Number: " + ticket.getOfficer().getBadge());
//            System.out.println("Car Make: " + ticket.getCar().getMake());
//            System.out.println("Car Model: " + ticket.getCar().getModel());
//            System.out.println("Car Color: " + ticket.getCar().getColor());
//            System.out.println("Car Year: " + ticket.getCar().getYear());
//            System.out.println("Car License Plate: " + ticket.getCar().getLicenseP());
//        } else {
//            System.out.println("\nNo Parking Ticket Issued. Car is parked legally.");
//        }
//    }
//}

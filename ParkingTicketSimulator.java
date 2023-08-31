import java.util.Scanner;
public class ParkingTicketSimulator {
    public static void main(String[] args) {
        // Create a parked car object
        Scanner ticketScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Is the car over their time limit?");
            String ticketInput = ticketScanner.nextLine();
            if (ticketInput.equalsIgnoreCase("yes")) {

                System.out.println("Ticket is being created...");
                System.out.println(" ");

                ParkedCar car = new ParkedCar();
                Scanner carScanner = new Scanner(System.in);
                ParkingMeter meter = new ParkingMeter();
                ParkingTicket ticket = new ParkingTicket();

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
                System.out.println(" ");

                System.out.println("Model: " + car.getModel());
                System.out.println("Make: " + car.getMake());
                System.out.println("Color: " + car.getColor());
                System.out.println("Year: " + car.getYear());
                System.out.println("License Plate: " + car.getLicenseP());
                System.out.println("Minutes Parked: " + car.getMinutesParked());


                System.out.println(" ");
                System.out.println("How many minutes did the car purchase?");
                int purchasedInput = carScanner.nextInt();
                meter.setpMinutes(purchasedInput);

                PoliceOfficer policeOfficer = new PoliceOfficer();
                Scanner policeScanner = new Scanner(System.in);


                System.out.println(" ");
                System.out.println("Please enter your your full name");
                String policenameInput = policeScanner.nextLine();
                policeOfficer.setName(policenameInput);

                System.out.println("Please enter your badge number");
                String policebadgeInput = policeScanner.nextLine();
                policeOfficer.setBadge(policebadgeInput);
                System.out.println(" ");


                int minutesOverDue = car.getMinutesParked() - meter.getpMinutes();
                double fine = 0.0;

                if (minutesOverDue > 0) {
                    fine = minutesOverDue * 0.50;
                }

                ticket.setFine(fine);

                System.out.println("Ticket has been created.");
                System.out.println("Police Officer: " + policeOfficer.getName());
                System.out.println("Badge Number: " + policeOfficer.getBadge());
                System.out.println("The total fine is: $" + String.format("%.2f", fine));


                break;
            } else if (ticketInput.equalsIgnoreCase("no")) {
                System.out.println("The car is not over its limit. It does not need to be fined and registered.");
                break;
            } else {
                System.out.println("Invalid input. Please enter yes or no.");
                System.out.println(" ");
            }
        }
    }
}

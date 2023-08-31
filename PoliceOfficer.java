

public class ParkingTicket {


    private ParkedCar car;
    private PoliceOfficer officer;
    private ParkingMeter parkingMeter;
    double fine;

    public ParkingTicket() {

    }
    public ParkingTicket(ParkedCar car, PoliceOfficer officer, ParkingMeter parkingMeter, double fine) {
        this.car = car;
        this.officer = officer;
        this.parkingMeter = parkingMeter;
        this.fine = fine;

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
    public void setFine(double fine){
        this.fine = fine;
    }
    public double getfine(){
        return fine;
    }
    



}

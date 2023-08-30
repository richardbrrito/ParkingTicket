package classwork;

public class ParkedCar {
	
	private String make, model, color, license;
	int year;
	private int minutes;
//	private double minutesParked;
	
	public ParkedCar() {
		
	}
	
	public ParkedCar(String cMake, String cModel, String cColor, int i, String cLicense, int cMinutes  ) { // double pMinutes
		make = cMake;
		model = cModel;
		color = cColor;
		year = i;
		minutes = cMinutes;
		license = cLicense;
	}
	
//		public double getpMinutes() {
//			return minutesParked;
//		}
//		public void setpMinutes(double minutesParked) {
//		    this.minutesParked = minutesParked;
//		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getMinutesParked() {
			return minutes;
		}
		public void setMinutesParked(int minutes) {
			this.minutes = minutes;
		}
		public String getLicenseP() {
			return license;
		}
		public void setLicenseP(String license) {
			this.license = license;
		}
		
				
	

}

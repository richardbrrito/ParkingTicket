package classwork;

public class ParkingMeter {
	
	private int pMinutes;
	
	
	public ParkingMeter() {
	}
		
		
		public ParkingMeter( int ppMinutes) {
			pMinutes = ppMinutes;
		}
		public int getpMinutes() {
			return pMinutes;
		}
		public void setpMinutes(int pMinutes) {
			this.pMinutes = pMinutes;
		}
		
		public String toString() {
			String toString = "Minutes that was purchased: " + pMinutes;
			return toString;
		}
		
	
	}



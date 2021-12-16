package labproject.finall;

public class Vehicle implements Comparable{
	private int topSpeed;
	private int seats;
	
	public Vehicle(int topSpeed, int seats) {
		super();
		this.topSpeed = topSpeed;
		this.seats = seats;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public String toString() {
		return this.getClass() + " Top Speed: " + topSpeed +  " Seats: " + seats;
	}

	public int compareTo(Object other) {
		if(this.getTopSpeed() < ((Vehicle) other).getTopSpeed ()) { 
			return -1;
		} else if (this.getTopSpeed() > ((Vehicle) other).getTopSpeed()) {
			return 1;
		}else {
			return 0;	
		}	
	}

	
	}




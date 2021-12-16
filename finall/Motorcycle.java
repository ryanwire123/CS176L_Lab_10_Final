package labproject.finall;

public class Motorcycle extends Vehicle {
	private boolean hasWindshield;

	public Motorcycle(int topSpeed, int seats, boolean hasWindshield) {
		super(topSpeed, seats);
		this.hasWindshield = hasWindshield;
	}

	public boolean isHasWindshield() {
		return hasWindshield;
	}

	public void setHasWindshield(boolean hasWindshield) {
		this.hasWindshield = hasWindshield;
	}
	
	public String toString() {
		String s = super.toString();
		return s + " Has a Windshield: " + hasWindshield + "||";
	}
	
	

}

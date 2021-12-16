package labproject.finall;

public class Truck extends Vehicle {
	private int payloadCapacity;
	private int towCapacity;
	public Truck(int topSpeed, int seats, int payloadCapacity, int towCapacity) {
		super(topSpeed, seats);
		this.payloadCapacity = payloadCapacity;
		this.towCapacity = towCapacity;
	}
	public int getPayloadCapacity() {
		return payloadCapacity;
	}
	public void setPayloadCapacity(int payloadCapacity) {
		this.payloadCapacity = payloadCapacity;
	}
	public int getTowCapacity() {
		return towCapacity;
	}
	public void setTowCapacity(int towCapacity) {
		this.towCapacity = towCapacity;
	}
	
	public String toString() {
		String s = super.toString();
		return s + " Payload Capacity: " + payloadCapacity + " Tow Capacity: "+ towCapacity + "||";
	}
	
	

}

package labproject.finall;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;


public class VehicleTester {
	public static void main(String[] args) throws FileNotFoundException {
		//Cars
		Car c1 = new Car(120, 5, "4WD", 4);
		Car c2 = new Car(90, 4, "FWD", 2);
		Car c3 = new Car(180, 4, "RWD", 2);
	
		//Trucks
		Truck t1 = new Truck(100, 5, 1000, 5000);
		Truck t2 = new Truck(95, 5, 1500, 4000);
		Truck t3 = new Truck(120, 5, 2000, 6000);
	
		//Motorcycles
		Motorcycle m1 = new Motorcycle(220, 1, false);
		Motorcycle m2 = new Motorcycle(130, 2, true);
	
	
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(c1);
		vehicles.add(c2);
		vehicles.add(c3);
		vehicles.add(t1);
		vehicles.add(t2);
		vehicles.add(t3);
		vehicles.add(m1);
		vehicles.add(m2);
	
		ArrayList<Truck> trucks = new ArrayList<>();
		trucks.add(t1);
		trucks.add(t2);
		trucks.add(t3);
	
		PrintWriter vehicleOutput = new PrintWriter("C:\\Users\\wirer\\Documents\\CS175L Java Workspace\\CS176L_FINAL\\src\\labproject\\finall\\output.txt");
		
		vehicleOutput.println("All Vehicles");
		
		for(Vehicle v : vehicles) {
			vehicleOutput.println(v);
		}
		vehicleOutput.println("=======================================================================================");
		vehicleOutput.println("All Vehicles Sorted by Top Speed");
		
		Collections.sort(vehicles);
		for(Vehicle v : vehicles) {
			vehicleOutput.println(v);
		}
		vehicleOutput.println("=======================================================================================");
		vehicleOutput.println("All Trucks");
		for(Truck t : trucks) {
			vehicleOutput.println(t);
		}
		vehicleOutput.println("=======================================================================================");
		vehicleOutput.println("All Trucks Sorted by Payload Capacity");
		
		Collections.sort(trucks, new CompareByPayload());
		for(Truck t : trucks) {
			vehicleOutput.println(t);
		}
		vehicleOutput.println("=======================================================================================");
		vehicleOutput.println("All Trucks Sorted by Tow Capacity");
		
		Collections.sort(trucks, new CompareByTow());
		for(Truck t : trucks) {
			vehicleOutput.println(t);
		}
		vehicleOutput.println("=======================================================================================");
		
		
		
		
		vehicleOutput.close();
	}
}

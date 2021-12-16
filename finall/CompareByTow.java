package labproject.finall;

import java.util.Comparator;

public class CompareByTow implements Comparator<Truck> {
	public int compare(Truck t1, Truck t2) {
		if(t1.getTowCapacity() < t2.getTowCapacity()) { 
			return -1;
		} else if (t1.getTowCapacity() > t2.getTowCapacity()) {
			return 1;
		}else {
			return 0;	
		}	
	}
		
}



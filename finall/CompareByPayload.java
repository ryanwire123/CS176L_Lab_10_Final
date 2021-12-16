package labproject.finall;

import java.util.Comparator;

public class CompareByPayload implements Comparator <Truck> {
	public int compare(Truck t1, Truck t2) {
		if(t1.getPayloadCapacity() < t2.getPayloadCapacity()) { 
			return -1;
		} else if (t1.getPayloadCapacity() > t2.getPayloadCapacity()) {
			return 1;
		}else {
			return 0;	
		}	
	}

}

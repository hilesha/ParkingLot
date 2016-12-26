package operatingLot;

import java.util.Vector;

public interface VehicleHandler<T> {
	
	public void addVehicleToLot(Vector<T> vehicleList,T vehicle);
	
	public void removeVehicleFromLot(Vector<T> vehicleList, T vehicle);

}

package operatingLot;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import creatingLot.Car;
import creatingLot.DrivingVehicle;
import creatingLot.VehicleSlot;

public class CarHandler {

	
	public static void addVehicleToLot(Vector<VehicleSlot> CarList,Car Car) {
		
		if(CarList == null){
			System.out.println("No Parking Lot created" + "\n");
			return;
		}
			Iterator<VehicleSlot> it = CarList.iterator();
			int vehicleTracker=0;
			while(it.hasNext()){
				VehicleSlot slot = it.next();
				vehicleTracker+=1;
				if (slot.isSlotFree()){
					CarList.get(vehicleTracker -1).setSlotFree(Boolean.FALSE);
					CarList.get(vehicleTracker -1).setVehicle(Car);
					System.out.println("Allocated slot number: " + vehicleTracker + "\n");
					return;
				}
			}
			System.out.println("Sorry, parking lot is full" + "\n");
		
	}

	
	public static void removeVehicleFromLot(Vector<VehicleSlot> carList, Integer Slot) {
		
		if(carList == null){
			System.out.println("No Parking Lot created" + "\n");
			return;
		}
		
		VehicleSlot elem = carList.get(Slot-1);
		elem.setSlotFree(Boolean.TRUE);
		elem.setVehicle(null);
		System.out.println("Slot Number " + Slot + " is free" + "\n");
		
	}
	
	public static void InitializeLot(Vector<VehicleSlot> slot, Integer SlotSize){
		for(int i=0;i <SlotSize; i++){
			slot.add(new VehicleSlot(Boolean.TRUE, null));
		}
	}
	
	

}

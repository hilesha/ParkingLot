package creatingLot;

public class VehicleSlot {
	
	private boolean isSlotFree;
	
	private DrivingVehicle vehicle;

	public boolean isSlotFree() {
		return isSlotFree;
	}

	public void setSlotFree(boolean isSlotFree) {
		this.isSlotFree = isSlotFree;
	}

	public DrivingVehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(DrivingVehicle vehicle) {
		this.vehicle = vehicle;
	}

	public VehicleSlot(boolean isSlotFree, DrivingVehicle vehicle) {
		super();
		this.isSlotFree = isSlotFree;
		this.vehicle = vehicle;
	}
	
	

}

package creatingLot;

public class DrivingVehicle {
	
	private String VehicleColor;
	private String VehicleRegNo;
	
	public DrivingVehicle(String vehicleRegNo, String vehicleColor) {
		super();
		VehicleColor = vehicleColor;
		VehicleRegNo = vehicleRegNo;
	}

	public String getVehicleColor() {
		return VehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		VehicleColor = vehicleColor;
	}

	public String getVehicleRegNo() {
		return VehicleRegNo;
	}

	public void setVehicleRegNo(String vehicleRegNo) {
		VehicleRegNo = vehicleRegNo;
	}

	@Override
	public String toString() {
		return "DrivingVehicle [VehicleColor=" + VehicleColor
				+ ", VehicleRegNo=" + VehicleRegNo + "]";
	}


}

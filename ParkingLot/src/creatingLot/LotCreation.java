package creatingLot;

import java.util.Vector;

import operatingLot.CarHandler;



public class LotCreation {
	
	private static LotCreation singleLotCreation;
	
	private Vector<VehicleSlot> parkingLot;
	
	private LotCreation(){};
	
	public synchronized static LotCreation getInstance(){
		if ( singleLotCreation == null){
			singleLotCreation = new LotCreation();
		}
		return singleLotCreation;
	}
	
	public void createParkingLot(Integer ParkingLotSpace){
		parkingLot = new Vector<VehicleSlot>(ParkingLotSpace);
		CarHandler.InitializeLot(parkingLot, ParkingLotSpace);
		System.out.println("Creating a parkingLot with " + ParkingLotSpace + " slots" + "\n");
	}

	public Vector<VehicleSlot> getParkingLot() {
		return parkingLot;
	}
	
	
}

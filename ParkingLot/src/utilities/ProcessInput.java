package utilities;

import operatingLot.CarHandler;
import queryingLot.QueryHandler;
import creatingLot.Car;
import creatingLot.LotCreation;

public class ProcessInput {
	
	public static boolean process(String[] inputTokens){
		boolean ValidateData = Boolean.TRUE;
		
		if(inputTokens[0].equals(Constants.CreateParkingLot)){
			LotCreation parkingLotRef = LotCreation.getInstance();
			parkingLotRef.createParkingLot(Integer.parseInt(inputTokens[1]));
		}
		
		else if(inputTokens[0].equals(Constants.Park)){
			Car creatingCar = new Car(inputTokens[1], inputTokens[2]);
			LotCreation parkingLotRef = LotCreation.getInstance();
			CarHandler.addVehicleToLot(parkingLotRef.getParkingLot(),creatingCar);	
		}
		
		else if(inputTokens[0].equals(Constants.Leave)){
			LotCreation parkingLotRef = LotCreation.getInstance();
			CarHandler.removeVehicleFromLot(parkingLotRef.getParkingLot(), Integer.parseInt(inputTokens[1]));	
		}
		
		else if(inputTokens[0].equals(Constants.Status)){
			LotCreation parkingLotRef = LotCreation.getInstance();
			QueryHandler.Status(parkingLotRef.getParkingLot());
		}
		
		else if(inputTokens[0].equals(Constants.QueryCarWithRegistrationForSlot)){
			LotCreation parkingLotRef = LotCreation.getInstance();
			QueryHandler.QueryWithRegNoReturningSlot(parkingLotRef.getParkingLot(), inputTokens[1]);
		}
		
		else if(inputTokens[0].equals(Constants.QueryCarListWithColorFetchRegistration)){
			LotCreation parkingLotRef = LotCreation.getInstance();
			QueryHandler.QueryWithColorReturningRegNo(parkingLotRef.getParkingLot(), inputTokens[1]);
		}
		
		else if(inputTokens[0].equals(Constants.QueryCarListWithColorForSlot)){
			LotCreation parkingLotRef = LotCreation.getInstance();
			QueryHandler.QueryWithColorReturningSlot(parkingLotRef.getParkingLot(), inputTokens[1]);
		}
		else{
			System.out.println("invalid input...exiting");
			ValidateData=Boolean.FALSE;
		}
		return ValidateData;
	}

}

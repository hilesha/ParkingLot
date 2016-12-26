package queryingLot;

import java.util.Iterator;
import java.util.Vector;

import creatingLot.DrivingVehicle;
import creatingLot.VehicleSlot;

public class QueryHandler {
	
	public static void Status(Vector<VehicleSlot> vehicleList){
		
		if(vehicleList == null){
			System.out.println("No Cars present to query" + "\n");
			return;
		}
		
		Iterator<VehicleSlot> it = vehicleList.iterator();
		int SlotNumber=1;
		System.out.println("Slot No." + "\t" + "Registration No" + "\t" + "Colour");
		while(it.hasNext()){
			
			VehicleSlot elem = it.next();
			if(!elem.isSlotFree()){
			System.out.println(SlotNumber + "\t" +  elem.getVehicle().getVehicleRegNo() + "\t" + elem.getVehicle().getVehicleColor());
			}
			SlotNumber+=1;
		}
		System.out.println("");
		
	}
	
	public static void QueryWithColorReturningSlot(Vector<VehicleSlot> vehicleList,String Color){
		
		if(vehicleList == null){
			System.out.println("No Cars present to query" + "\n");
			return;
		}
		
		Iterator<VehicleSlot> it = vehicleList.iterator();
		int SlotNumber=1;
		StringBuffer sb = new StringBuffer();
		
		
		while(it.hasNext()){
			
			VehicleSlot elem = it.next();
			if (!elem.isSlotFree() && elem.getVehicle().getVehicleColor().equals(Color)){
				sb.append(SlotNumber);
				sb.append(",");
			}
			SlotNumber+=1;
			
			
		}
		System.out.println(sb.substring(0,sb.length()-1)  + "\n");
	}
	
	public static void QueryWithColorReturningRegNo(Vector<VehicleSlot> vehicleList,String Color){
		
		if(vehicleList == null){
			System.out.println("No Cars present to query" + "\n");
			return;
		}
		
		Iterator<VehicleSlot> it = vehicleList.iterator();
		int SlotNumber=1;
		StringBuffer sb = new StringBuffer();
		while(it.hasNext()){
			
			VehicleSlot elem = it.next();
			if (!elem.isSlotFree() && elem.getVehicle().getVehicleColor().equals(Color)){
				sb.append(elem.getVehicle().getVehicleRegNo());
				sb.append(",");
			}
			SlotNumber+=1;
			
		}
		System.out.println(sb.substring(0,sb.length()-1)  + "\n");
	}
	
	public static void QueryWithRegNoReturningSlot(Vector<VehicleSlot> vehicleList,String RegNo){
		
		if(vehicleList == null){
			System.out.println("No Cars present to query" + "\n");
			return;
		}
		
		Iterator<VehicleSlot> it = vehicleList.iterator();
		int SlotNumber=1;
		StringBuffer sb = new StringBuffer();
		while(it.hasNext()){
			
			VehicleSlot elem = it.next();
			if (!elem.isSlotFree() && elem.getVehicle().getVehicleRegNo().equals(RegNo)){
				sb.append(SlotNumber);
				sb.append(",");
				}
			SlotNumber +=1;
		}
		
		
		if(sb.length()==0){
				System.out.println("Not Found");
		}
		else{
			System.out.println(sb.substring(0,sb.length()-1) + "\n");
		}
		
	}
	
	
}

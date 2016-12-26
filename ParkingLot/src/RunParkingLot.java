import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import operatingLot.CarHandler;
import queryingLot.QueryHandler;

import creatingLot.Car;
import creatingLot.LotCreation;

import utilities.Constants;
import utilities.ProcessInput;


public class RunParkingLot {

	public static void main(String args[]){

		

		if(args.length > 0){
			String Line=null;
			BufferedReader br = null;
			FileReader fr = null;
			PrintStream out =null;

			try {
				fr = new FileReader(args[0]);
				br = new BufferedReader(fr);
				out = new PrintStream(new FileOutputStream(args[1]));
				System.setOut(out);
				System.setErr(out);

				try {
					while((Line = br.readLine()) != null)
					{
						ProcessInput.process(Line.split(" "));
					}

				} catch (IOException e) {

					e.printStackTrace();
				}

			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}finally{

				try{
					if(br != null){
						br.close();
					}
					if(fr!=null){
						fr.close();
					}}
				catch(IOException ex){
					ex.printStackTrace();
				}

			}
			System.exit(1);
		}
		else {
			Scanner scan = new Scanner(System.in);
			String input="";
			int i=0;

			do{
				input = scan.nextLine();			
			}
			while(ProcessInput.process(input.split(" ")));
		}



	}
}
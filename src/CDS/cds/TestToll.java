package cds;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import Entity.Customer;
import Entity.Vehicle;
import Controller.Controller_Customer;

public class TestToll 
{
	//--Decimal format for easy reading
	static DecimalFormat RFID = new DecimalFormat("000000");
	static DecimalFormat dollars = new DecimalFormat("$0.00");
	
	//--Constants	
		
	//--Variables	
	
	//--Constructors
	TestToll() // Constructor
	{
		//do something
		clear(); //also known as init();		
	}	
	//--Private Methods
	private static void printCustomers(HashMap<String,Customer> _customers) 
														//This function iterates through a copy of the customers and prints out their
														//account balances
	{
		System.out.println();
		Object tempCustomer = new Customer();
		HashMap<String,Customer> tempCustomers = new HashMap<String,Customer>(_customers);
		Iterator it = tempCustomers.entrySet().iterator();
	    //Goofy way to iterate through Hashmaps
		while (it.hasNext()) 
	    {
	        Map.Entry pairs = (Map.Entry)it.next();
	        tempCustomer = pairs.getValue();
	        if(((Customer) tempCustomer).getIsTollTag() == true)
	        {
	        	System.out.println("\t\t\tTollTag User: " + pairs.getKey() + " owes: " + dollars.format(((Customer) tempCustomer).getTollBalance()));
	        }
	        else
	        {
	        	System.out.println("\t\t\tZipCash Plate: " + pairs.getKey() + " owes: " + dollars.format(((Customer) tempCustomer).getTollBalance()));
	        }	        
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	    System.out.println();
	}		
	//--End Private Methods
	//////////////////////////////////////////////////////////////////////////////	
	//--Start Main
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		boolean notDone = true;
		TestToll tollGate = new TestToll();		
		HashMap<String,Customer> customers = new HashMap<String,Customer>();
		int currentCustomer = 0;
		while(notDone) // read commands and obey them
		{ 
			String line = in.nextLine();
			String [] tokens = line.split("[ ]+"); // there is a space in between the brackets
			int command = (int)line.charAt(0); // in Java 7 you case switch on Strings
			
			//Variables
			String tollId;
			String name;
			String userId;
			Customer tempCustomer = new Customer();
			String DLplateNum;
				    		    				
			switch(command) 
			{	
	        	case (int)'S': //Print: Toll Gate Program started...
	        		System.out.println("Toll Gate Program started...\n");
	        		break;    
	        	case (int) 'D': // A zipcash user
	        		//Parse input
	        		tollId = tokens[1];
	        		DLplateNum = tokens[2];
	        		
	        		//Adds a new user if they have never used the tollroad, otherwise it let's them use the tollroad
	        		if( customers.containsKey(DLplateNum))
	        		{
	        			tempCustomer = customers.get(DLplateNum);
		        		Controller_Customer.driveThroughTollGate(tempCustomer, tollId);
	        		}
	        		else
	        		{          		        		
	        			//name
		        		tempCustomer.setName(DLplateNum);
		        		
		        		//userID
		        		userId = DLplateNum;
		        		tempCustomer.setUserId(DLplateNum);
		        		tempCustomer.setIsTollTag(false);
		        		Controller_Customer.driveThroughTollGate(tempCustomer, tollId);
		        		
		        		//put the customer in the HashMap
		        		customers.put(userId,tempCustomer);
		        		
		        		//Output
		        		System.out.println("\tAdded New ZipCash account: " + tempCustomer.getName());
		        		currentCustomer++;
	        		}
	        		
	        		//output
	        		System.out.println("Plate #: " + DLplateNum + " drove through " + tollId);
	        		
	        		//tollGate = new TestToll();	        		
	        		break;
	        	case (int) 'R': // A tolltag user
	        		//parse input
	        		tollId = tokens[1];
	        		String customerId = tokens[2];
	        		
	        		//Grab the customer and drive them through the tollGate
	        		tempCustomer = customers.get(customerId);
	        		Controller_Customer.driveThroughTollGate(tempCustomer, tollId);
	        		
	        		//output
	        		System.out.println("Customer: " + customerId + " drove through " + tollId);	        		
	        		break;	        	
	        	case (int) 'U': // Create a customer account
	        		//parse Input Name
	        		name = tokens[1];
	        		tempCustomer.setName(name);
	        		
	        		//userID
	        		userId = tokens[2];
	        		tempCustomer.setUserId(userId);
	        		tempCustomer.setIsTollTag(true);
	        		
	        		//put the customer in the HashMap
	        		customers.put(userId,tempCustomer);
	        		
	        		//Output
	        		System.out.println("\tAdded New TollTag account: Name: " + tempCustomer.getName() + ", user ID: " + tempCustomer.getUserId());
	        		currentCustomer++;
	        		break;
	        	case (int) 'A': // Add Vehicle
	        		//get userID
	        		userId = tokens[1];
	        		
	        		//find customer in HashMap
	        		tempCustomer = customers.get(userId);
	        		
	        		//Get DLPlate for car
	        		DLplateNum = tokens[2];
	        		
	        		//Add the vehicle
	        		tempCustomer.addVehicle(tempCustomer.getUserId(), DLplateNum);
	        		
	        		//Output
	        		System.out.println("\t\tVehicle Added to user: " + tempCustomer.getUserId() 
	        							+ ", Plate #: " + tempCustomer.vehicles(tempCustomer.getNumTollTags()-1).getPlateNumber() 
	        							+ ", TollTag #: " + RFID.format(tempCustomer.vehicles(tempCustomer.getNumTollTags()-1).getRFIDNumber()));
	        		
	        		break;
	        	case (int) 'T': //Print Customers
	        		printCustomers(customers);
	        		break;
	        	case (int) '#': //commented out input
	        		break;	        	
	        	case (int) 'E': //End the Loop
	        		System.out.println("\nToll Gate Program ended...");
	        		notDone = false;
	        	default: 
	        		break;        	
	        }//	end switch
        }//		end while       
	}//			end main	
}//				end

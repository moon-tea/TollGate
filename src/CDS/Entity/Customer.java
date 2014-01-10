package Entity;

import java.util.ArrayList;

public class Customer 
{
	private String name;
	private String userId;
	private ArrayList<Vehicle> vehicles;
	private int numTollTags;
	private Billing_Info billingInfo;
	private Address mailingAddress;
	private double tollBalance;
	private double accountBalance;
	private int accountNumber;
	private boolean isTollTag;
	
	public Customer()
	{
		vehicles = new ArrayList<Vehicle>();
		billingInfo = new Billing_Info();
		mailingAddress = new Address();
		numTollTags = 0;		
	}
	
	//get&setacountType
	public void setIsTollTag(boolean type)
	{
		this.isTollTag = type;
	}
	public boolean getIsTollTag()
	{
		return isTollTag;
	}
	
	//get&set name
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	//get&set userId
	public void setUserId(String userId)
	{
		this.userId = userId;
	}
	public String getUserId()
	{
		return userId;
	}
	//get&set billingInfo
	public void setBillingInfo(String billingName, Address billingAddress, int creditCardNumber, int creditCardExpDateMonth, 
								int creditCardExpDateYear, int creditCardSecurityCode, int bankAccountNumber, 
								int routingNumber, Address bankAddress, String bankCompany, boolean directWithdrawal, 
								boolean paperlessReceipts, boolean paperlessStatements)
	{
		billingInfo.setBillingName(billingName);
		billingInfo.setBillingAddress(billingAddress);
		billingInfo.setCreditCardNumber(creditCardNumber);
		billingInfo.setCreditCardExpDateMonth(creditCardExpDateMonth);
		billingInfo.setCreditCardExpDateYear(creditCardExpDateYear);
		billingInfo.setCreditCardSecurityCode(creditCardSecurityCode);
		billingInfo.setBankAccountNumber(bankAccountNumber);
		billingInfo.setRoutingNumber(routingNumber);
		billingInfo.setBankAddress(bankAddress);
		billingInfo.setBankCompany(bankCompany);
		billingInfo.setDirectWithdrawal(directWithdrawal);
		billingInfo.setPaperlessStatements(paperlessStatements);
		billingInfo.setPaperlessReceipts(paperlessReceipts);
	}
	//get&set tollBalance
	public void setTollBalance(double tollBalance)
	{
		this.tollBalance = tollBalance;
	}
	public void updateTollBalance(double newToll)
	{
		this.tollBalance += newToll;
	}
	public double getTollBalance()
	{
		return tollBalance;
	}
	//get&set accountBalance
	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance = accountBalance;
	}
	public double getAccountBalance()
	{
		return accountBalance;	
	}
	//get&set accountNumber
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
		
	public int getNumTollTags()
	{
		return numTollTags;
	}
	//add Vehicle
	//vehicleNumber is equal to the index of the ArrayList
	public void addVehicle( String plateNumber, String vinNumber, String make, String model,
							int year, String tollTagNumber)
	{

		Vehicle newVehicle = new Vehicle(numTollTags);
		newVehicle.setPlateNumber(plateNumber);
		newVehicle.setVinNumber(vinNumber);
		newVehicle.setMake(make);
		newVehicle.setModel(model);
		newVehicle.setYear(year);
		newVehicle.setTollTagNumber(tollTagNumber);
		
		vehicles.add(newVehicle);
		numTollTags++;
	}
	
	//simple vehicle adder
	public void addVehicle( String _userId, String plateNumber)
	{	
		Vehicle newVehicle = new Vehicle(numTollTags);		
		newVehicle.setPlateNumber(plateNumber);
		newVehicle.setRFIDNumber();
		vehicles.add(newVehicle);
		numTollTags++;
	}
	
	public void removeVehicle(int vehicleNumber)
	{
		vehicles.remove(vehicleNumber);
		
		//iterate through the list of vehicles and reduce the 
		//vehicleNumber starting from the one after the one that was removed
		for(int i = vehicleNumber; i < vehicles.size(); i++)
		{
			vehicles.get(i).setVehicleNumber(i);
		}
		numTollTags--;
	}
	
	public Vehicle vehicles(int position)
	{
		return vehicles.get(position);
	}
}

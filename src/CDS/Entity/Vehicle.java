package Entity;

public class Vehicle 
{
	private static int counter = 0;
	private int vehicleNumber;	//vehicle ID in association to the customer, which customer's vehicle is it
	private String plateNumber;	
	private String vinNumber;
	private String make;
	private String model;
	private int year;
	private String tollTagNumber;	//
	private int RFIDNumber;
	
	public Vehicle(int vehicleNumber)
	{
		this.vehicleNumber = vehicleNumber;
	}
	protected void setVehicleNumber(int vehicleNumber)
	{
		this.vehicleNumber= vehicleNumber;
	}
	//get&set plateNumber
	protected void setPlateNumber(String plateNumber)
	{
		this.plateNumber = plateNumber;
	}
	public String getPlateNumber()
	{
		return plateNumber;
	}
	
	//get&set vinNumber
	protected void setVinNumber(String vinNumber)
	{
		this.vinNumber = vinNumber;
	}
	protected String getVinNumber()
	{
		return vinNumber;
	}
	
	//get&set make
	protected void setMake(String make)
	{
		this.make = make;
	}
	protected String getMake()
	{
		return make;
	}
	
	//get&set model
	protected void setModel(String model)
	{
		this.model = model;
	}
	protected String getModel()
	{
		return model;
	}	
	//get&set year
	protected void setYear(int year)
	{
		this.year = year;
	}
	protected int getYear()
	{
		return year;
	}
	//get&set tollTagNumber
	protected void setTollTagNumber(String tollTagNumber)
	{
		this.tollTagNumber = tollTagNumber;
	}
	public String getTollTagNumber()
	{
		return tollTagNumber;
	}
	public void setRFIDNumber()
	{
		RFIDNumber = counter;
		counter++;
	}
	public int getRFIDNumber()
	{
		return RFIDNumber;
	}
	
}

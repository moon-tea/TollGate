package Entity;

import java.lang.StringBuilder;

public class Address 
{

	private int streetNumber;
	private String streetName;
	private String suffix;
	private String city;
	private String state;
	private int zip;
	
	public Address()
	{
	}
	
	//returns String representation of address
	//Format: 
	//	##### streetName Sf.
	//	City, ST ######
	protected String getAddress()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(streetNumber + " ");
		sb.append(streetName + " ");
		sb.append(suffix + "\n");
		sb.append(city + ", ");
		sb.append(state + " ");
		sb.append(zip);
		
		return sb.toString();
	}
	
	//get&set streetNumber
	protected void setStreetNumber(int streetNumber)
	{
		this.streetNumber = streetNumber;
	}
	protected int getStreetnumber()
	{
		return streetNumber;
	}
	
	//get&set streetName
	protected void setStreetName(String streetName)
	{
		this.streetName = streetName;
	}
	protected String getStreetName()
	{
		return streetName;
	}
	
	//get&set suffix
	protected void setSuffix(String suffix)
	{
		this.suffix = suffix;
	}
	protected String getSuffix()
	{
		return suffix;
	}
	
	//get&set city
	protected void setCity(String city)
	{
		this.city = city;
	}
	protected String getCity()
	{
		return city;
	}
	
	//get&set state
	protected void setState(String state)
	{
		this.state = state;
	}
	protected String setState()
	{
		return state;
	}
	//get&set zip
	protected void setZip(int zip)
	{
		this.zip = zip;
	}
	protected int getZip()
	{
		return zip;
	}
}

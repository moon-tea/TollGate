package Entity;

public class Billing_Info 
{

	private String billingName;
	private Address billingAddress;
	private int creditCardNumber;
	private int creditCardExpDateMonth;
	private int creditCardExpDateYear;
	private int creditCardSecurityCode;
	private int bankAccountNumber;
	private int routingNumber;
	private Address bankAddress;
	private String bankCompany;
	private boolean directWithdrawal;
	private boolean paperlessReceipts;
	private boolean paperlessStatements;
	
	public Billing_Info()
	{
		billingAddress = new Address();
	}
	//get&set billingName
	public void setBillingName(String billingName)
	{
		this.billingName = billingName;		
	}
	public String getBillingName()
	{
		return billingName;
	}
	
	//get&set setBillingAddress
	public void setBillingAddress(int streetNumber, String streetName, String suffix, String city, String state, int zip)
	{
		billingAddress.setStreetNumber(streetNumber);
		billingAddress.setStreetName(streetName);
		billingAddress.setSuffix(suffix);
		billingAddress.setCity(city);
		billingAddress.setState(state);
		billingAddress.setZip(zip);
	}
	public void setBillingAddress(Address billingAddress)
	{
		this.billingAddress = billingAddress;
	}
	public String getBillingAddress()
	{
		return billingAddress.getAddress();
	}
	
	//get&set creditCardNumber
	public void setCreditCardNumber(int creditCardNumber)
	{
		this.creditCardNumber = creditCardNumber;
	}
	public int getCreditCardNumber()
	{
		return creditCardNumber;
	}
	
	//get&set creditCardExpDateMonth
	public void setCreditCardExpDateMonth(int creditCardExpDateMonth)
	{
		this.creditCardExpDateMonth = creditCardExpDateMonth;
	}
	public int getCreditCardExpDateMonth()
	{
		return creditCardExpDateMonth;
	}
	
	//get&set creditCardExpDateYear
	public void setCreditCardExpDateYear(int creditCardExpDateYear)
	{
		this.creditCardExpDateYear = creditCardExpDateYear;
	}
	public int getCreditCardExpDateYear()
	{
		return creditCardExpDateYear;
	}
	
	//get&set creditCardSecurityCode
	public void setCreditCardSecurityCode(int creditCardSecurityCode)
	{
		this.creditCardSecurityCode = creditCardSecurityCode;
	}
	public int getCreditCardSecurityCode()
	{
		return creditCardSecurityCode;
	}
	
	//get&set bankAccountNumber
	public void setBankAccountNumber(int bankAccountNumber)
	{
		this.bankAccountNumber = bankAccountNumber;
	}
	public int getBankAccountNumber()
	{
		return bankAccountNumber;
	}
	
	//get&set routingNumber
	public void setRoutingNumber(int routingNumber)
	{
		this.routingNumber = routingNumber;
	}
	public int getRoutingNumber()
	{
		return routingNumber;
	}
		
	//get&set setBankAddress
	public void setBankAddress(int streetNumber, String streetName, String suffix, String city, String state, int zip)
	{
		bankAddress.setStreetNumber(streetNumber);
		bankAddress.setStreetName(streetName);
		bankAddress.setSuffix(suffix);
		bankAddress.setCity(city);
		bankAddress.setState(state);
		bankAddress.setZip(zip);
	}
	
	public void setBankAddress(Address bankAddress)
	{
		this.bankAddress = bankAddress;
	}
	public String getBankAddress()
	{
		return bankAddress.getAddress();
	}
	
	//get&set bankCompany
	public void setBankCompany(String bankCompany)
	{
		this.bankCompany = bankCompany;
	}
	public String getBankCompany()
	{
		return bankCompany;
	}
	
	//get&set directWithDrawal
	public void setDirectWithdrawal(boolean directWithdrawal)
	{
		this.directWithdrawal = directWithdrawal;
	}
	public boolean directWithdrawal()
	{
		return paperlessReceipts;
	}
		
	//get&set paperlessReceipts
	public void setPaperlessReceipts(boolean paperlessReceipts)
	{
		this.paperlessReceipts = paperlessReceipts;
	}
	public boolean getPaperlessReceipts()
	{
		return paperlessReceipts;
	}
	
	//get&set paperlessStatements
	public void setPaperlessStatements(boolean paperlessStatements)
	{
		this.paperlessStatements = paperlessStatements;
	}
	public boolean getPaperlessStatements()
	{
		return paperlessStatements;
	}	

}

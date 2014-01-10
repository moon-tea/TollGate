package Controller;
import Entity.Customer;

public class Controller_TollGate_Transaction {

	public static void billCustomerforTollGateTransaction(Customer _customer, String _tollGateId, boolean _isTollTag) 
	{
		_customer.updateTollBalance(calculateToll(_tollGateId, _isTollTag));
	}

	public static double calculateToll(String _tollGateId, boolean _isTollTag) 
	{
		switch(_tollGateId) 
		{	
        	case "GB_01": //Cost is $1.00 or $1.50
        		if( _isTollTag)
        		{
        			return 1.00;
        		}
        		else
        		{
        			return 1.50;
        		}
        		//break;    
        	case "GB_02": // Cost is $1.20 or $1.80
        		if( _isTollTag)
        		{
        			return 1.20;
        		}
        		else
        		{
        			return 1.80;
        		}        			        		
        		//break;
        	default:
        		return 0.00;
        		//break;
		}
	}

	public void addToZipCashBalance(double _toll) 
	{

	}

}

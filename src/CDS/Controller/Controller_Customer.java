package Controller;
import Entity.Address;
import Entity.Customer;

public class Controller_Customer 
{

	public boolean verifyAddress(int _address) 
	{
		return false;
	}

	public static void driveThroughTollGate(Customer _customer, String _tollGateId) 
	{
		Controller_TollGate_Transaction.billCustomerforTollGateTransaction(_customer, _tollGateId, _customer.getIsTollTag());
	}

}

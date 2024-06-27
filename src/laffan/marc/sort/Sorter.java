package laffan.marc.sort;

import java.util.ArrayList;
import java.util.List;

import laffan.marc.customer.Customer;

public class Sorter {

	private static List customerData;

	public Sorter()
	{
		initialiseData()
	}
	
	public void initialiseData() {
		customerData = new ArrayList<Customer>();
		Customer fred = new Customer();	
		customerData.add(fred);
	}
	
	public static void main(String args[]) {
		Sorter sorter = new Sorter();
	}
	
	public static List getCustomerData() {
		return customerData;
	}

	public static void setCustomerData(List customerData) {
		Sorter.customerData = customerData;
	}
	
}

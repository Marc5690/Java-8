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

	}
	
	public static void main(String args[]) {
		Sorter sorter = new Sorter();
		Customer fred = new Customer.CustomerBuilder().setId(1).setName("Marc").setAge(20).setAddress("townsville").setRating(5).build();
		customerData.add(fred);
	}
	
	public static List getCustomerData() {
		return customerData;
	}

	public static void setCustomerData(List customerData) {
		Sorter.customerData = customerData;
	}
	
}

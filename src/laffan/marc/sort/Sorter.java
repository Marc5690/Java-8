package laffan.marc.sort;

import java.util.ArrayList;
import java.util.List;

import laffan.marc.customer.Customer;

public class Sorter {

	private static List<Customer> customerData;

	public Sorter()
	{
		initialiseData();
	}
	
	public void initialiseData() {
		customerData = new ArrayList<Customer>();
	}
	
	public static void main(String args[]) {
		Sorter sorter = new Sorter();
		Customer fred = new Customer.CustomerBuilder().setId(1).setName("Fred").setAge(20).setAddress("Townsville").setRating(1).build();
		Customer tom = new Customer.CustomerBuilder().setId(1).setName("Tom").setAge(30).setAddress("Metroplois").setRating(2).build();
		Customer dick = new Customer.CustomerBuilder().setId(1).setName("Dick").setAge(40).setAddress("Gotham").setRating(4).build();
		Customer harry = new Customer.CustomerBuilder().setId(1).setName("Harry").setAge(50).setAddress("Nuketown").setRating(5).build();
		
		customerData.add(fred);
		customerData.add(tom);
		customerData.add(dick);
		customerData.add(harry);
		
		long countOfRatingsAboveThree = customerData.stream().filter(cd ->  cd.getRating() > 3).count();
		
		for(Customer c : customerData) {
			System.out.println(c);
		}
		System.out.println("Number of above-three ratings: " + countOfRatingsAboveThree);
	}
	
	public static List getCustomerData() {
		return customerData;
	}

	public static void setCustomerData(List customerData) {
		Sorter.customerData = customerData;
	}
	
}

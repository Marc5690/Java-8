package laffan.marc.sort;

import java.util.ArrayList;
import java.util.List;

import laffan.marc.customer.Customer;

public interface Sorter {
	
	public List<Customer> getCustomerData();

	public void setCustomerData(List<Customer> customerData);
	
	public long getNumOfCustomersWithRatingAboveThree();

	void initialiseCustomerData();
}

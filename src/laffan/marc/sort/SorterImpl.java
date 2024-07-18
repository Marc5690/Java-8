package laffan.marc.sort;

import java.util.ArrayList;
import java.util.List;

import laffan.marc.customer.Customer;

import laffan.marc.dao.CustomerDAOImpl;
public class SorterImpl implements Sorter{

	private List<Customer> customerData;

	public SorterImpl(){
		super();
		initialiseCustomerData();
	}
	
	@Override
	public void initialiseCustomerData() {
		customerData = new CustomerDAOImpl().readCustomersFromDatabase();
	}
	
	
	@Override
	public List<Customer> getCustomerData() {
		return customerData;
	}
	
	@Override
	public void setCustomerData(List<Customer> customerData) {
		this.customerData = customerData;
	}

	@Override
	public long getNumOfCustomersWithRatingAboveThree() {
		return customerData.stream().filter(cd ->  cd.getRating() > 3).count();
	}
	
}

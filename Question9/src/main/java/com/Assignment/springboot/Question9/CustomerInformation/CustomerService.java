package com.Assignment.springboot.Question9.CustomerInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.stereotype.Component;


@Component
public class CustomerService {

private static List<Customer> cust = new ArrayList<>();
private static int count = 0;
	
	static
	{
		cust.add(new Customer(++count,"Radha","radha@gmail.com",19));
		cust.add(new Customer(++count,"Mohan","mohan@gmail.com",26));
		cust.add(new Customer(++count,"Shoma","shoma@gmail.com",22));
	}
	public List<Customer> findAll() {
		return cust;
	}
	
	public Customer save(Customer customer) {
		customer.setId(++count);
		cust.add(customer);
		return customer;
		
	}
	 
	
	public Customer findOne(int id) {
		Predicate<? super Customer> predicate = customer -> customer.getId().equals(id) ;
		return cust.stream().filter(predicate).findFirst().get();	
		}
	
	public void deleteById(int id) {
		Predicate<? super Customer> predicate = customer -> customer.getId().equals(id);
		cust.removeIf(predicate);
	}
	
	public void updateById(int id , Customer c)
    {
    	for(int i=0;i<cust.size(); i++)
    	{
    		Customer ob = cust.get(i);
    		if(ob.getId().equals(id))
    		{
    			cust.set(i, c);
    			return;
    		}
    	}
    	
    }

}

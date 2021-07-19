package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.example.demo.model.Customer;

public class Customerservice<customer, custlist> {
	
	private List<customer> custlist;
	public Customerservice() {
		super();
		custlist = new ArrayList<customer>();
	}
	private void init() {
		this.custlist.add((customer) new Customer(101,"gfhgjl",86787));
		this.custlist.add((customer) new Customer(102,"JgjhjJl",5677));
	}
  public boolean add(customer custlist) {
	  return this.custlist.add(custlist);
  }
  public customer getcustomerById(int id) {
  customer cust= null;
  Optional<customer> resp =
       this.custlist.stream().filter(c->c.getcustomerById()==id)
       .findFirst();

  if(resp.isPresent()) {
	  cust=(customer) resp.get();
  }
  else
  {
	  throw new RuntimeException("element not found");
  }
  return cust;
  }
  public List<customer> getAllcustomer(){
	  init();
	  return this.custlist;
  }
}

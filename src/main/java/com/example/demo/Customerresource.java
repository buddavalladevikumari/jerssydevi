package com.example.demo;
import java.util.List;

import javax.xml.ws.Response;
import javax.xml.ws.Service;

import com.example.demo.model.Customer;
import com.example.demo.service.Customerservice;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("Customers")
public class Customerresource {
	
	private Object Service;
  Customerservice service = new Customerservice();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<Customer> getAllcustomers(){
		
		return  service.getAllcustomer();
		
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getcustomerById(@PathParam("id")int id) {
		return ((Customerresource) Service).getcustomerById(id);
	}
	

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response addCustomer(Customer cust) {
		boolean isAdded = ((List<Customer>) this.Service).add(cust);
		
		if(isAdded) {
			return Response.status(201).entity(cust).build();
		}else {
			throw new RuntimeException("exception");
		}
		
	}

}

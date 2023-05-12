package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
@RestController
//@RequestMapping("/customer")
//@CrossOrigin("http://localhost:4200")
public class CustomerController {
	
	private CustomerService custdao;
	
	@Autowired
	public CustomerController(CustomerService custdao) {
		this.custdao = custdao;
	}
	@RequestMapping("save")
	public String addcustomer(@RequestBody Customer cust) {
		custdao.register(cust);
		return "register Sucessfully";
	}
	@GetMapping("displayAllCust")
	public List<Customer> displayAllCust(){
		return custdao.displayAllCustomers();	
	}
	@DeleteMapping("deleteBYId/{customerId}")
	public void deleteCustomer(@PathVariable("customerId")int customerId) {
		custdao.removeBasedById(customerId);
	}
	@PutMapping("updateCust")
	public void updateCust(@RequestBody Customer cust) {
		custdao.update(cust);
	}
}

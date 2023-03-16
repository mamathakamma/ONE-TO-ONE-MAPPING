package com.example.mapping1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping1.entity.Address;
import com.example.mapping1.service.AddressService;

@RestController
@RequestMapping("address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping
	public Address save(@RequestBody Address address)
	{
		Address address1 = new Address();
		address1.setDistrict(address.getDistrict());
		address1.setState(address.getState());
		//address1.setPerson(address1.getPerson());
		return addressService.save(address);
	}
	
	@GetMapping
	public List<Address> readAll()
	{
		return addressService.readAll();
	}
	
	@GetMapping("{id}")
	public Address read(@PathVariable int id)
	{
		return addressService.read(id);
	}
	
	@DeleteMapping("{id}")
	public void deleteAddress(@PathVariable int id)
	{
		addressService.deleteAddress(id);
	}
	
	
}

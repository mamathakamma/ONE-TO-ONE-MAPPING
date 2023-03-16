package com.example.mapping1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping1.entity.Address;
import com.example.mapping1.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	public Address save(Address address)
	{
		return addressRepository.save(address);
	}
	
	public List<Address> readAll()
	{
		return (List<Address>) addressRepository.findAll();
	}
	
	public Address read(int id)
	{
		return addressRepository.findById(id).get();
	}
	
	public void deleteAddress(int id)
	{
		addressRepository.deleteById(id);
	}
}

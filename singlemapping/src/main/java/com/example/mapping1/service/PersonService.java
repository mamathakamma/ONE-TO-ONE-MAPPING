package com.example.mapping1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping1.entity.Person;
import com.example.mapping1.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public Person save(Person person)
	{
		Person person1 = new Person();
		person1.setFirstName(person.getFirstName());
		person1.setLastName(person.getLastName());
		person1.setAddress(person.getAddress());
		return personRepository.save(person);
	}
	
	public List<Person> readAll()
	{
		return (List<Person>) personRepository.findAll();
	}
	
	public Person read(int id)
	{
		return personRepository.findById(id).get();
	}
	
	public void deletePerson(int id)
	{
		personRepository.deleteById(id);
	}
}

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

import com.example.mapping1.entity.Person;
import com.example.mapping1.service.PersonService;

@RestController
@RequestMapping("person")
public class PersonController {
	
		@Autowired
		private PersonService personService;
		
		@PostMapping
		public Person savePerson(@RequestBody Person person)
		{
			return personService.save(person);
		}
		
		@GetMapping
		public List<Person> readAll()
		{
			return personService.readAll();
		}
		
		@GetMapping("{id}")
		public Person read(@PathVariable int id)
		{
			return personService.read(id);
		}
		
		@DeleteMapping("{id}")
		public void deletePerson(@PathVariable int id)
		{
			personService.deletePerson(id);
		}
}

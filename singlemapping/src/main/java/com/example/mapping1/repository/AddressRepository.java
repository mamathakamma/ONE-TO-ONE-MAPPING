package com.example.mapping1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping1.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}

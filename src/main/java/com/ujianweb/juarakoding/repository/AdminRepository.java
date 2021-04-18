package com.ujianweb.juarakoding.repository;

import org.springframework.data.repository.CrudRepository;

import com.ujianweb.juarakoding.entity.Admin;


public interface AdminRepository extends CrudRepository<Admin, Long> {
	
	public Admin findById(long id);
	public Admin findByUsername(String username);
}
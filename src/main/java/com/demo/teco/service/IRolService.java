package com.demo.teco.service;

import java.util.List;

import com.demo.teco.entity.Role;

public interface IRolService {
	
	public List<Role> findAll();

	public void save(Role cliente);
	
	public Role findOne(Long id);
	
	public void delete(Long id);
	
}

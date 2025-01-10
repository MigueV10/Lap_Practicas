package com.coderhouse.interfaces;

import java.util.List;

import com.coderhouse.models.User;

public interface UserRestInterface {
	//metodo que quiero utilizar para todo mi proyecto
	
	public List<User> getAllUsers();
	
	public User getUserById(String id);
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public void deleteUser(String id);
	
}

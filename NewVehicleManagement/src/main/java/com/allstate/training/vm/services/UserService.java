package com.allstate.training.vm.services;

import java.util.List;

import com.allstate.training.vm.entities.Users;
import com.allstate.training.vm.exceptions.BuisnessException;

public interface UserService {
	public void addUsers(Users u )throws BuisnessException;
	public void updateUsers(Users u)throws BuisnessException;
	public void deleteUsers(String id)throws BuisnessException;
	public Users getUsersById(String usersId)throws BuisnessException;
	public List<Users> getUsersByType(String Type)throws BuisnessException;
	public List<Users> getAllUsers()throws BuisnessException;
	public Users login(String username, String password)throws BuisnessException;

}

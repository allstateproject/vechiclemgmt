package com.allstate.training.vm.daos;

import java.util.List;
import com.allstate.training.vm.entities.Users;

public interface UsersDao {
		
	
	public void addUsers(Users u );
	public void updateUsers(Users u);
	public void deleteUsers(String id);
	public Users getUsersById(String usersId);
	public List<Users> getUsersByType(String Type);
	public List<Users> getAllUsers();
	public Users login(String username, String password);

}

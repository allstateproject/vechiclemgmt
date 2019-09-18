package com.allstate.training.vm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.allstate.training.vm.daos.UsersDao;
import com.allstate.training.vm.entities.Users;
import com.allstate.training.vm.exceptions.BuisnessException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UsersDao userDao;
	
	public void addUsers(Users u)throws BuisnessException {
		if(u.getUserId().startsWith("A")||u.getUserId().startsWith("P")||u.getUserId().startsWith("D")||u.getUserId().startsWith("C")) {
			userDao.addUsers(u);
		}else
			throw new BuisnessException("Invalid User Id given, hence User NOT ADDED");
	}

	public void updateUsers(Users u) throws BuisnessException{
		if(u.getUserId().startsWith("A")||u.getUserId().startsWith("P")||u.getUserId().startsWith("D")||u.getUserId().startsWith("C")) {
			userDao.updateUsers(u);
		} else
			throw new BuisnessException("User does not exit, hence User NOT UPDATED");
	}		

	public void deleteUsers(String userId) throws BuisnessException{
		userDao.deleteUsers(userId);
	}

	public Users getUsersById(String usersId)throws BuisnessException {
		if (usersId.startsWith("A")||usersId.startsWith("P")||usersId.startsWith("D")||usersId.startsWith("C")) {
			Users user = userDao.getUsersById(usersId);
			return user;
		} else
			throw new BuisnessException("Invalid User Id given, hence User NOT RETRIEVED");
	}

	public List<Users> getUsersByType(String uType) throws BuisnessException{
		List<Users> users = userDao.getUsersByType(uType);
		if(users.isEmpty()) {
			throw new BuisnessException("No Users Available for User Type");
		}else {
		return users;
		}
	}

	public List<Users> getAllUsers()throws BuisnessException {
		List<Users> users = userDao.getAllUsers();
		if (!users.isEmpty()) {
			return users;
		} else {
			throw new BuisnessException("No Schedules Available");
		}
	}

	public Users login(String username, String password)throws BuisnessException {
		return userDao.login(username, password);
	}

}

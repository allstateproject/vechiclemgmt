package com.allstate.training.vm.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.allstate.training.vm.entities.Users;

@Repository
public class UsersDaoImpl implements UsersDao {
	@Autowired
	SessionFactory sessionFactory;


	public void addUsers(Users u) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(u);
		session.getTransaction().commit();
		session.close();
	
		
	}

	public void updateUsers(Users u) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.update(u);
		session.getTransaction().commit();
		session.close();
		

	}

	public void deleteUsers(String id) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Users u=(Users)session.get(Users.class,new String(id));
		session.delete(u);
		session.getTransaction().commit();
		session.close();
	}

	public Users getUsersById(String usersId) {
		Session session=sessionFactory.openSession();
		Users u=(Users)session.get(Users.class, new String(usersId));
		session.close();
		return u;
	}


	public List<Users> getUsersByType(String Type) {
		Session session = sessionFactory.openSession();
		List<Users> users = session.createCriteria(Users.class).list();
		return users;

	}

	public List<Users> getAllUsers() {
		Session session = sessionFactory.openSession();
		List<Users> users = session.createCriteria(Users.class).list();
		return users;

	}

	public Users login(String userId, String password) {
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Users.class);
		Criterion uname=Restrictions.eq("userId", userId);
		Criterion pass=Restrictions.eq("password", password);
		LogicalExpression andExp=Restrictions.and(uname, pass);
		cr.add(andExp);
		Users user=(Users) cr.uniqueResult();
		
		return user;
	}

}
package com.allstate.training.vm.daos;

import java.util.List;

import javax.security.auth.login.Configuration;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.allstate.training.vm.entities.Employee;



@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	SessionFactory sessionFactory;
	
	
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		session.close();

	}
	

	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.update(e);
		session.getTransaction().commit();
		session.close();
	}

	
	public void deleteemployee(String id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Employee e=(Employee)session.get(Employee.class,new String(id));
		session.delete(e);
		session.getTransaction().commit();
		session.close();

	}

	public Employee getEmployeeById(String employeeId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Employee e=(Employee)session.get(Employee.class, new String(employeeId));
		session.close();
		return e;
	}

	
	
	public Employee getEmployeeByPhone(long employeePhoneNum) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Employee.class);
		cr.add(Restrictions.eq("employeePhoneNum", employeePhoneNum));
		Employee e1=(Employee) cr.uniqueResult();
		return e1 ;
	}

	public Employee getEmployeeByAadar(long employeeAadharNo) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Employee.class);
		cr.add(Restrictions.eq("employeeAadharNo", employeeAadharNo));
		Employee e1=(Employee) cr.uniqueResult();
		return e1 ;
	}

	public Employee getDriverByDLnum(String DriverDLNum) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Employee.class);
		cr.add(Restrictions.eq("DriverDLNum", DriverDLNum));
		Employee e1=(Employee) cr.uniqueResult();
		return e1 ;
	}

	public List<Employee> getEmployeeByType(String Type) {
		// TODO Auto-generated method stub
		
			Session session = sessionFactory.openSession();
			Criteria cr = session.createCriteria(Employee.class);
			cr.add(Restrictions.eq("employeeType", Type));
			List<Employee> employee = cr.list();
			return employee;

		
		
	}
	
	public List<Employee> getAll() {
		// TODO Auto-generated method stub

			Session session = sessionFactory.openSession();
			List<Employee> employee = session.createCriteria(Employee.class).list();
			return employee;


	}

}
